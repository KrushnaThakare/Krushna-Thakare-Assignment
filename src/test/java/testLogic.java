import org.json.simple.JSONObject;

public class testLogic extends baseTest {

	public int count =0;
	public void validatePlayers() {


		try{for(int i=0;i<arr.size();i++)
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
		catch(Exception expection)
		{
			System.out.println("Exception Occured in Validate Player Method");
		}

	}

	public boolean validateWicketKeeper() {

		try
		{
			boolean flag1=true;
			boolean flag2=false;
			boolean flag3;

			int count1=0;
			for(int i=0;i<arr.size();i++)
			{
				JSONObject wk = (JSONObject) arr.get(i);

				String role = (String) wk.get("role");
				if(role.equalsIgnoreCase("Wicket-keeper"))
				{
					count1++;
				}
			}
			if(count1>=1) {
				System.out.println("Team is Valid  having atleast 1 Wicket Keeper");
				flag3=flag1;

			}else {
				System.out.println("Team is not meeting criterio");
				flag3=flag2;

			}
			return flag3;
		}catch(Exception exception)
		{
			System.out.println("Exception Occured in validate wicketkeeper method");
			return false;
		}
	}

}


