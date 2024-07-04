package steps;

import com.titrate.pageObjects.DeleteCamera;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class DeleteCam extends BaseClass
{
	DeleteCamera dc =new DeleteCamera(driver);
	@Given("click on delete icon button")
	public void click_on_delete_icon_button() throws InterruptedException
	{
		dc.clickDelete();
		Thread.sleep(3000);


	}

	@Then("Camera should be deleted")
	public void camera_should_be_deleted() 
	{
		System.out.println("Camera successfully deleted");
		driver.quit();

	}




}
