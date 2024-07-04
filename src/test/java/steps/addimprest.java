package steps;

import com.titrate.pageObjects.AddImprest;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class addimprest extends BaseClass
{
	AddImprest a=new AddImprest(driver);
	@Given("users click on imprest icon button")
	public void users_click_on_imprest_icon_button() throws InterruptedException 
	{
		a.clickImprest();
		Thread.sleep(2000);

	}

	@Given("click on add imprest button")
	public void click_on_add_imprest_button() throws InterruptedException 
	{
		a.clickAddImprest();
		Thread.sleep(2000);

	}

	@Given("user enters the name as {string}")
	public void user_enters_the_name_as(String Name) 
	{
		a.setName(Name);

	}

	@Given("enters description as {string}")
	public void enters_description_as(String descr)
	{
		a.setDesc(descr);

	}

	@Given("user enters the phoneNo1 as {string}")
	public void user_enters_the_phone_no1_as(String phone1) 
	{
		a.setPhno1(phone1);

	}

	@Given("user enters the extension1 as {string}")
	public void user_enters_the_extension1_as(String exet1) 
	{

		a.setExtension1(exet1);
	}

	@Given("user enters the phoneNo2 as {string}")
	public void user_enters_the_phone_no2_as(String phone2) 
	{
		a.setPhno2(phone2);

	}

	@Given("user enters the extension2 as {string}")
	public void user_enters_the_extension2_as(String exet2) 
	{
		a.setExtension2(exet2);

	}
	@Given("enters Serial number as {string}")
	public void enters_serial_number_as(String sno) 
	{
	   a.setSlno(sno);
	}

	@Then("imprest should be added")
	public void imprest_should_be_added() 
	{
		System.out.println("Imprest added successfully");
		driver.quit();

	}




}
