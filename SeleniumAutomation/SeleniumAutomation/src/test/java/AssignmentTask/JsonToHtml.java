package AssignmentTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class JsonToHtml {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		
		JSONParser parser = new JSONParser();
		
		FileReader fr = new FileReader("./src/test/resources/Data.json");
		JSONObject jobj = (JSONObject)parser.parse(fr);
		
		String paraData = new String(Files.readAllBytes(Paths.get("./src/test/resources/Paragraph.txt")));
		System.out.println(paraData);
		
		System.out.println("===============================================================================");
		
		paraData = paraData.replace("&name&", jobj.get("name").toString());
		paraData = paraData.replace("&&countries&&", jobj.get("countries").toString());
		paraData = paraData.replace("&&continents&&", jobj.get("continents").toString());
		
		ArrayList feature = (ArrayList)jobj.get("features");
		paraData = paraData.replace("/&features[0]&/", feature.get(0).toString());
		paraData = paraData.replace("!&features[1]&!", feature.get(1).toString());
		
		System.out.println(paraData);
		
		System.out.println("==========================================================================");
		
		File htmlFile = new File("./src/test/resources/UpdateParagraphTemplate.html");
		String htmlString = FileUtils.readFileToString(htmlFile , "UTF-8");
		
		htmlString = htmlString.replace("$body", paraData);
		
		File outputFile = new File("./src/test/resources/OutputPara.html");
		FileUtils.writeStringToFile(outputFile , htmlString , "UTF-8");
		System.out.println("Pass");
		

	}

}
