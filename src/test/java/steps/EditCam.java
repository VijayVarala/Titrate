package steps;

import com.titrate.pageObjects.EditCamera;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class EditCam extends BaseClass{
	public EditCamera ec=new EditCamera(driver);
	@Given("click on edit icon button")
	public void click_on_edit_icon_button(){
		
	   ec.clickEditButton();
	    
	}

	@Given("user clears the existing camera name and enter name as {string}")
	public void user_clears_the_existing_camera_name_and_enter_name_as(String NewCamName) {
	   ec.clearCamName();
	    ec.editCamName(NewCamName);
	}

	@Then("Camera details should be edited")
	public void camera_details_should_be_edited() {
	   
	    System.out.println("Camera details edited");
	    driver.quit();
	}




}
