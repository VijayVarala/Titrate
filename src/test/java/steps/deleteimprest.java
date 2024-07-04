package steps;

import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class deleteimprest extends BaseClass
{
	@Then("imprest should be deleted")
	public void imprest_should_be_deleted() 
	{
	   System.out.println("successfully deleted imprest");
	   driver.quit();
	}


}
