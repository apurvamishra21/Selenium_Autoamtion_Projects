package parameterization;

public class ExcelUsingUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelReader eat = new ExcelReader("D:\\Technical\\software docs\\MyFolderByJava\\TestData23_10_2022.xlsx");
		
		int colCount = eat.getColumnCount("Credentials");
	       System.out.println("Total Columns in the Excel : "+colCount);
	       int rowCount = eat.getRowCount("Credentials");
	       System.out.println("Total Rows in the Excel : "+rowCount);

	}

}
