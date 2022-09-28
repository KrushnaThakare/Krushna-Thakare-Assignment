import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TeamRCB {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\JsonFile\\TeamRCB.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject playerData=(JSONObject)obj;

		String teamName=(String)playerData.get("name");
		
		//System.out.println(teamName);
		
		JSONArray arr=(JSONArray)playerData.get("player");
		int count =0;
		for(int i=0;i<arr.size();i++)
		{
			JSONObject player=(JSONObject)arr.get(i);
			
			String country=(String)player.get("country");
			if(!country.equalsIgnoreCase("India"))
			{
				count++;
			}
			
		}
		if(count==4)
		{
			System.out.println("Team is valid having 4 foreign players");
		}else {
			System.out.println("Team is Invalid");
		}
		
	}

	
}


//@Before Test incliude json part
//Test logic write in test layer
