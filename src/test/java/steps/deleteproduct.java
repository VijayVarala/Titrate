package steps;

import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.Then;

public class deleteproduct extends BaseClass 
{

	@Then("product should be deleted")
	public void product_should_be_deleted() 
	{
	   System.out.println("Successfully deleted");
	   driver.quit();
	}



}
