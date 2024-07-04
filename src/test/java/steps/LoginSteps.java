package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.titrate.pageObjects.LoginPage;

import io.cucumber.java.en.*;


public class LoginSteps{
	public WebDriver driver;
	public LoginPage lp;
	 @BeforeClass(alwaysRun = true)
	@Given("User navigate to the Titrate application")
	public void user_navigate_to_the_titrate_application() {
	driver=new ChromeDriver();
	driver.get("http://183.82.108.168");
	System.out.println(driver.getTitle());
	lp=new LoginPage(driver);
	}

	@Given("User enter the username as {string}")
	public void user_enter_the_username_as(String username) {
	    lp.setUserName(username);
	  
	}

	@Given("User enter the password as {string}")
	public void user_enter_the_password_as(String password) {
	    lp.setPassword(password);
	  
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() throws InterruptedException {
	    lp.clickSubmit();
	    System.out.println("**************************");
	    Thread.sleep(4000);
	  
	}
	 @AfterClass(alwaysRun = true)
	@Then("Login should be success")
	public void login_should_be_success() {
	    System.out.println(driver.getTitle());
	   boolean b= driver.getPageSource().contains("Manohar");
	   System.out.println(b);
	  driver.quit();
	}

	

}
