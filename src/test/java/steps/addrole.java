package steps;

import com.titrate.pageObjects.AddRole;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class addrole extends BaseClass
{
	public AddRole a;
	@When("user click on role icon button")
	public void user_click_on_role_icon_button() 
	{
		a=new AddRole(driver);
		a.clickRoles();
	    
	}

	@When("click on add role button")
	public void click_on_add_role_button() 
	{
	    
	    a.clickAddRole();
	}

	@When("user enters Role as {string}")
	public void user_enters_role_as(String string) 
	{
	    
	    a.setRole(string);
	}

	@When("user enters Description as {string}")
	public void user_enters_description_as(String string) 
	{
	    
	    a.setDesc(string);
	}

	@Then("new role should be added successfully")
	public void new_role_should_be_added_successfully() 
	{
	    System.out.println("Succesfully added");
	    
	}



	

}
