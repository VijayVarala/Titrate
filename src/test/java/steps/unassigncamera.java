package steps;

import com.titrate.pageObjects.UnAssignCamera;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class unassigncamera extends BaseClass
{
	UnAssignCamera u=new UnAssignCamera(driver);
	@Given("users click on uncheckbox")
	public void users_click_on_uncheckbox() 
	{
	   u.clickCheckBox();
	}

	@Then("camera should be un assigned")
	public void camera_should_be_un_assigned() 
	{
	   System.out.println("successfully un assigned the camera");
	   driver.quit();
	}




}
