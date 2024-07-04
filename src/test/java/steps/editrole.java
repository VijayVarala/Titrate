package steps;

import com.titrate.pageObjects.EditRole;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class editrole extends BaseClass
{
	public EditRole e;
	@When("user clears the existing role name and enter name as {string}")
	public void user_clears_the_existing_role_name_and_enter_name_as(String string) 
	{
	    e=new EditRole(driver);
	    e.setRole(string);
	    
	}

	@When("user clears the existing description and enter desc as {string}")
	public void user_clears_the_existing_description_and_enter_desc_as(String string) 
	{
	    e.setDesc(string);
	    
	}

	@Then("roles details should be edited")
	public void roles_details_should_be_edited() 
	{
	    System.out.println("Successfully editied");
	    driver.quit();
	}




}
