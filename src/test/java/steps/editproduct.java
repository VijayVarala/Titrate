package steps;

import com.titrate.pageObjects.EditProduct;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class editproduct extends BaseClass
{
	EditProduct e;

	@When("user clears the product name and enters ProductName as {string}")
	public void user_clears_the_product_name_and_enters_product_name_as(String string) 
	{
	    e=new EditProduct(driver);
	    e.setProductname(string);
	    
	}

	@When("user clears the strength and enters Strength as {string}")
	public void user_clears_the_strength_and_enters_strength_as(String string) 
	{
	    e.setStrength(string);
	    
	}

	@When("user clears the label code and enters Label Code as {string}")
	public void user_clears_the_label_code_and_enters_label_code_as(String string) 
	{
	    e.setLabelCode(string);
	    
	}

	@When("user edited Pack UOM from dropdown")
	public void user_edited_pack_uom_from_dropdown() 
	{
	    e.clickPackDropDown();
	    e.clickPack();
	    
	}

	@When("user edited Measure from dropdown")
	public void user_edited_measure_from_dropdown() 
	{
	    
	    
	}

	@When("user edited Product Form from dropdown")
	public void user_edited_product_form_from_dropdown() 
	{
	    e.clickMeasureDropDown();
	    e.clickMeasure();
	    
	}

	@When("user edited Brand from dropdown")
	public void user_edited_brand_from_dropdown() 
	{
	    e.clickBrandDropDown();
	    e.clickBrand();
	    
	}

	@When("user edited Generic from dropdown")
	public void user_edited_generic_from_dropdown()
	{
	    e.clickGenericDropDown();
	    e.clickGeneric();
	    
	}

	@When("clears the pack size and enters Pack Size as {string}")
	public void clears_the_pack_size_and_enters_pack_size_as(String string)
	{
	    e.setPackSize(string);
	    
	}

	@Then("product details should be edited")
	public void product_details_should_be_edited() 
	{
	    System.out.println("successfully edited");
	    driver.quit();
	    
	}

}
