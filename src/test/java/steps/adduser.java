package steps;

import com.titrate.pageObjects.AddUser;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class adduser extends BaseClass{
	AddUser a=new AddUser(driver);
	@Given("users click on user icon button")
	public void users_click_on_user_icon_button() throws InterruptedException {
	   a.clickUsers();
	  Thread.sleep(3000);
	}

	@Given("click on add user button")
	public void click_on_add_user_button() throws InterruptedException {
	   
	    a.clickAddUser();
	    Thread.sleep(3000);
	}

	@Given("user enters the firstname name as {string}")
	public void user_enters_the_firstname_name_as(String firstname) {
	   
	    a.setFirstName(firstname);
	}

	@Given("user enters the last name as {string}")
	public void user_enters_the_last_name_as(String lastname) {
	   a.setLastame(lastname);
	    
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
	   a.setUserName(username);
	    
	}

	@Given("user enters the phoneNo as {string}")
	public void user_enters_the_phone_no_as(String phno) {
	   a.setPhoneNo(phno);
	    
	}

	@Given("user enters the email as {string}")
	public void user_enters_the_email_as(String email) throws InterruptedException {
	   
	    a.setEmail(email);
	    Thread.sleep(3000);
	}

	@Then("User should be added")
	public void user_should_be_added() {
	   System.out.println("Successfully user is added");
	    driver.quit();
	}




}
