package steps;

import com.titrate.pageObjects.EditImprest;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class editimprest extends BaseClass
{
	EditImprest e=new EditImprest(driver);

	@Given("user clears the name and enter the new name as {string}")
	public void user_clears_the_name_and_enter_the_new_name_as(String string) 
	{
	    e.setName(string);
	    
	}

	@Given("user clears the description and enter the new description as {string}")
	public void user_clears_the_description_and_enter_the_new_description_as(String string) 
	{
	    
	    
	}

	@Given("user clears the phoneNo1 and enter new number as {string}")
	public void user_clears_the_phone_no1_and_enter_new_number_as(String string) {
	    
	    
	}

	@Given("user clears the extension1 and enter new extension as {string}")
	public void user_clears_the_extension1_and_enter_new_extension_as(String string) {
	    
	    
	}

	@Given("user clears the phoneNo2 and enter new number as {string}")
	public void user_clears_the_phone_no2_and_enter_new_number_as(String string)
	{
	    
	    
	}

	@Given("user clears the extension2 and enter extension {string}")
	public void user_clears_the_extension2_and_enter_extension(String string) 
	{
	    
	    
	}

	@Given("user clears Serial number and enters new serialno as {string}")
	public void user_clears_serial_number_and_enters_new_serialno_as(String string) 
	{
	    
	    
	}

	@Then("imprest details should be edited")
	public void imprest_details_should_be_edited() 
	{
	    System.out.println("Successfully edited the details");
	    driver.quit();
	    
	}



}
