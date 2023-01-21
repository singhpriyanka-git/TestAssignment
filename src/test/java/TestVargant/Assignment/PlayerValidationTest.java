package TestVargant.Assignment;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;


public class PlayerValidationTest {


	@Test
	public void getFourForeignPlayersDetails()
	{		
		JsonTestData getJsonData= new JsonTestData();	
		JsonPath jsonArray= new JsonPath(getJsonData.getPayload());
		System.out.println("Printing List of countries  : "+jsonArray.getString("player.country"));
		int countryList= jsonArray.getInt("player.country.size()");

		int countOfForeignPlayers=0;
		try {
			for( int i=0; i<countryList;i++)
			{
				if(!jsonArray.getString("player["+i+"].country").equalsIgnoreCase("India"))
				{
					countOfForeignPlayers=countOfForeignPlayers+ 1;
					System.out.println("Printing 4 foreign Players Name["+i+"] :  " +jsonArray.getString("player["+i+"].name"));
				}		
			}
			Assert.assertEquals(4, countOfForeignPlayers);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	@Test
	public void getOneWicketKeeper()
	{		
		JsonTestData getJsonData= new JsonTestData();	
		JsonPath jsonArray= new JsonPath(getJsonData.getPayload());
		System.out.println("Printing List of roles in Team  : "+jsonArray.getString("player.role"));
		int roleList= jsonArray.getInt("player.role.size()");

		int roleCount=0;
		try {
			for( int i=0; i<roleList;i++)
			{
				if(jsonArray.getString("player["+i+"].role").equalsIgnoreCase("Wicket-keeper"))
				{
					roleCount=roleCount+ 1;
					System.out.println("Printing role count:" +jsonArray.getString("player["+i+"].role"));
				}

			}
			Assert.assertEquals(1, roleCount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


