package steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.titrate.pageObjects.LoginPage;
import com.titrate.testCases.BaseClass;
import com.titrate.utilities.Capture;

import io.cucumber.java.en.*;

public class Invalid extends BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	@Given("User navigate to the Titrate")
	public void user_navigate_to_the_titrate() 
	{
		driver=new ChromeDriver();
		driver.get("http://183.82.108.168");
		System.out.println(driver.getTitle());
		lp=new LoginPage(driver);
	    
	}

	@Given("User enter the usersname as {string}")
	public void user_enter_the_usersname_as(String string) 
	{
	    lp.setUserName(string);
	    
	}

	@Given("User enter password as {string}")
	public void user_enter_password_as(String string) 
	{
	    lp.setPassword(string);
	    
	}

	@When("User click on the login")
	public void user_click_on_the_login() throws InterruptedException  
	{
	    lp.clickSubmit();
	    Thread.sleep(6000);
   }

	@Then("Login should not be success")
	public void login_should_not_be_success() throws IOException 
	{
		 //WebElement i=driver.findElement(By.xpath("//p[text()='Invalid username and password']"));
	WebElement i=	driver.findElement(By.id("password-helper-text"));
			boolean b=	i.isDisplayed();
			if(i.isDisplayed()) 
			{
				System.out.println("Login is failed" + " & test case is passed");
			}
			System.out.println(b);
			Assert.assertTrue(b);
			System.out.println(i.getText());
			String s=driver.getPageSource();
			String emsg="Invalid username and password";
			if(s.contains(emsg)) 
			{
				System.out.println("Error msg found");
				Capture.CaptureScreenshot(driver, "img1.png");
			}

	 
	    
	}




}
