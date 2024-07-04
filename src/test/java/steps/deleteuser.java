package steps;

import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.Then;

public class deleteuser extends BaseClass
{
	@Then("user should be deleted")
	public void user_should_be_deleted() 
	{
		System.out.println("Successfully deleted the user");
		driver.quit();
	}

}
