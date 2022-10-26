package parameterization;

import java.io.FileInputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String path;
	public FileInputStream fis = null;
	public FileInputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	
	
	public ExcelReader(String path) {
		this.path = path;
		try
		{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//returns the row count in a sheet
	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if(index == -1)
			return 0;
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum()+1;
			return number;
		}
		}
	
	
	

//returns data from cell
public String getCellData(String sheetName , int colNum , int rowNum) {
	
	try {
		if(rowNum <= 0)
			return "";
		
		int index = workbook.getSheetIndex(sheetName);
		
		if(index == -1)
			return "";
		
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum - 1);
		if(row == null)
			return "";
		cell = row.getCell(colNum);
		if(cell == null)
			return "";
		
		if(cell.getCellType() == CellType.STRING)
			return cell.getStringCellValue();
		else if(cell.getCellType() == CellType.NUMERIC) {
			String cellText = String.valueOf(cell.getNumericCellValue());
			
			if(DateUtil.isCellDateFormatted(cell)) {
				//format in the form of M/D/YY
				double d = cell.getNumericCellValue();
				
				Calendar cal = Calendar.getInstance();
				cal.setTime(DateUtil.getJavaDate(d));
				cellText = (String.valueOf(Calendar.YEAR)).substring(2);
				cellText = cal.get(Calendar.MONTH) + 1 + "/"+
							cal.get(Calendar.DAY_OF_MONTH) + "/"+
							cellText;
			}
			return cellText;
			
			}else if(cell.getCellType() == CellType.BLANK)
				cell.getStringCellValue();
	 else if (cell.getCellType() == CellType.BOOLEAN) {
         cell.toString();
	 } else {
         cell.toString();
     }}catch(Exception e) {
			e.printStackTrace();
		}
	return null;
	}
	
     
	

		
	
		
	

	public int getColumnCount(String sheetName) {
	int index = workbook.getSheetIndex(sheetName);
	if(index == -1)
		return 0;
	else {
	
	       sheet = workbook.getSheet(sheetName);
	       row = sheet.getRow(0);
	       int colCount = row.getLastCellNum();
	       return colCount;
	   }
}
	/*try {
		if(rowNum <= 0)
			return "";
		
		int index = workbook.getSheetIndex(sheetName);
		
		if(index == -1)
			return "";
		
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum - 1);
		if(row == null)
			return "";
		cell = row.getCell(colNum);
		if(cell == null)
			return "";
		
		if(cell.getCellType() == CellType.STRING)
			return cell.getStringCellValue();
		else if(cell.getCellType() == CellType.NUMERIC) {
			String cellText = String.valueOf(cell.getNumericCellValue());
			
			/*if(DateUtil.isCellDateFormatted(cell)) {
			
			double d = cell.getNumericCellValue();
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(DateUtil.getJavaDate(d));
			cellText = (String.valueOf(Calendar.YEAR)).substring(2);
			}*/
	
/*
 * private LocalDate readCellAsDate(final Row row, final int pos) {
    if (pos == -1) {
        return null;
    }
    final Cell cell = row.getCell(pos - 1);
    if (cell != null) {
        cell.setCellType(CellType.NUMERIC);
    } else {
        return null;
    }
    if (DateUtil.isCellDateFormatted(cell)) {
        try {
            return cell.getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (final NullPointerException e) {
            logger.error(e.getMessage());
            return null;
        }
    }
    return null;
}*/
}
			
	
			
			
	

	

