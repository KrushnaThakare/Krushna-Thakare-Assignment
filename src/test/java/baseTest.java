import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class baseTest {

	public static JSONArray arr;
	@BeforeTest

	public void jsonParse() throws IOException, ParseException
	{
		JSONParser jsonparser = new JSONParser();

		FileReader reader = new FileReader(".\\JsonFile\\TeamRCB.json");

		Object obj = jsonparser.parse(reader);

		JSONObject playerData=(JSONObject)obj;

		JSONArray arr=(JSONArray)playerData.get("player");
		
		
		
	}


}
