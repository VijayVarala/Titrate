package steps;

import com.titrate.pageObjects.AssignCamera;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class assigncamera extends BaseClass
{
	AssignCamera a=new AssignCamera(driver);
	@Given("users click on assigncam button")
	public void users_click_on_assigncam_button() throws InterruptedException
	{
	    a.clickAssignCam();
	    Thread.sleep(2000);
	}

	@Given("users click on checkbox")
	public void users_click_on_checkbox() throws InterruptedException 
	{
	    a.clickCheckBox();
	    Thread.sleep(2000);
	}

	@When("users click on assign button")
	public void users_click_on_assign_button() throws InterruptedException 
	{
	    a.clickAssign();
	    Thread.sleep(2000);
	}

	@Then("camera should be assigned")
	public void camera_should_be_assigned() 
	{
	    System.out.println("successfully camera assigned");
	    driver.quit();
	}




}
