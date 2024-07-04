package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.titrate.pageObjects.AddCamera;
import com.titrate.pageObjects.LoginPage;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCamera1  extends BaseClass{
	public AddCamera ac;
	@Given("user launch the browser")
	public void user_launch_the_browser() throws InterruptedException 
	{
		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(baseURL);

		LoginPage lp =new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(password);
		lp.clickSubmit();

		ac=new AddCamera(driver);
		Thread.sleep(5000);


	}

	@Given("users Click on camera icon button")
	public void users_click_on_camera_icon_button() throws InterruptedException {
		ac.clickCamIcon();
		Thread.sleep(3000);

	}

	@Given("click on add camera button")
	public void click_on_add_camera_button() throws InterruptedException {

		ac.clickAddCam();
		Thread.sleep(3000);
	}

	@Given("user enters the camera name as {string}")
	public void user_enters_the_camera_name_as(String string) 
	{
		ac.setCamName(string);

	}

	@Given("enters serial number as {string}")
	public void enters_serial_number_as(String string) 
	{
		ac.setSlno(string);

	}

	@Given("user selects the model from dropdown")
	public void user_selects_the_model_from_dropdown() 
	{

		ac.clickModel();
		ac.setModel();
	}

	@Given("user enters the url as {string}")
	public void user_enters_the_url_as(String string) {
		ac.setUrl(string);

	}

	@When("user click on save button")
	public void user_click_on_save_button() 
	{
		ac.clickSave();

	}

	@Then("Camera should be added") 
	public void camera_should_be_added() 
	{
		System.out.println("Success");
		driver.quit();
	}




}
