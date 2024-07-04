package steps;

import com.titrate.pageObjects.AddImprestProduct;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class addimprestproduct extends BaseClass
{
	AddImprestProduct a;
	@Given("user clicks imprest product icon")
	public void user_clicks_imprest_product_icon() 
	{
	    a=new AddImprestProduct(driver);
	    a.clickMenuIcon();
	    a.clickImprestIcon();
	    
	}

	@Given("user clicks add imprest product button")
	public void user_clicks_add_imprest_product_button() 
	{
	    a.clickAddImprestProduct();
	    
	}

	@Given("user selects Imprest Name from dropdown")
	public void user_selects_imprest_name_from_dropdown() 
	{
	    a.clickProductDropDown();
	    a.clickProductName();
	    
	}

	@Given("user enters Minimum Stock as {string}")
	public void user_enters_minimum_stock_as(String string)
	{
	    a.setMinStock(string);
	    
	}

	@Given("user enters Maximum Stock as {string}")
	public void user_enters_maximum_stock_as(String string)
	{
	    a.setMaxStock(string);
	    
	}

	@Given("user enters Available Stock as {string}")
	public void user_enters_available_stock_as(String string) 
	{
	    
	    a.setAvailableStock(string);
	}

	@Then("imprest product should be added")
	public void imprest_product_should_be_added() 
	{
	    System.out.println("Successfully added");
	    driver.quit();
	    
	}


}
