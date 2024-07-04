package steps;

import com.titrate.pageObjects.EditUser;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class edituser extends BaseClass{
	EditUser e=new EditUser(driver);
	@Given("user clears the firstname name and enter the new name as {string}")
	public void user_clears_the_firstname_name_and_enter_the_new_name_as(String fstname)
	{
		
	   e.editFirstName(fstname);
	    
	}

	@Given("user clears the lastname and enter the new name as {string}")
	public void user_clears_the_lastname_and_enter_the_new_name_as(String lstname)
	{
	   
	  
	}

	@Given("user clears the username name and enter the new name as {string}")
	public void user_clears_the_username_name_and_enter_the_new_name_as(String string)
	
	{
	   
	    
	}

	@Given("user clears the phoneNo and enter the new number as {string}")
	public void user_clears_the_phone_no_and_enter_the_new_number_as(String string) 
	{
	   
	    
	}

	@Given("user clears the email and enter the new email as {string}")
	public void user_clears_the_email_and_enter_the_new_email_as(String string)
	{
	   
	    
	}

	@Then("User details should be edited")
	public void user_details_should_be_edited() 
	{
	   System.out.println("Successfully edited");
	   driver.quit();
	    
	}




}
