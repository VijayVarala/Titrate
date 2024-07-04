package steps;

import com.titrate.pageObjects.AddProduct;
import com.titrate.testCases.BaseClass;

import io.cucumber.java.en.*;

public class addproduct extends BaseClass
{
	AddProduct a;
	@When("user click on product icon")
	public void user_click_on_product_icon() 
	{
	    a=new AddProduct(driver);
	    a.clickProductIcon();
	  
	}

	@When("user click on add product")
	public void user_click_on_add_product() 
	{
	    a.clickAddProduct();
	  
	}

	@When("user enters ProductName as {string}")
	public void user_enters_product_name_as(String string) 
	{
	    a.setProductname(string);
	  
	}

	@When("user enters Strength as {string}")
	public void user_enters_strength_as(String string)
	{
	    
	  a.setStrength(string);
	}

	@When("user enters Label Code as {string}")
	public void user_enters_label_code_as(String string)
	{
	    a.setLabelCode(string);
	  
	}

	@When("user selects Pack UOM from dropdown")
	public void user_selects_pack_uom_from_dropdown()
	{
	    a.clickPackDropDown();
	    a.clickPack();
	  
	}

	@When("selects Measure from dropdown")
	public void selects_measure_from_dropdown() 
	{
	    a.clickMeasureDropDown();
	    a.clickMeasure();
	  
	}

	@When("selects Product Form from dropdown")
	public void selects_product_form_from_dropdown() 
	{
	    a.clickProductFormDropDown();
	    a.clickProductForm();
	  
	}

	@When("selects Brand from dropdown")
	public void selects_brand_from_dropdown() 
	{
	    a.clickBrandDropDown();
	    a.clickBrand();
	  
	}

	@When("selects Generic from dropdown")
	public void selects_generic_from_dropdown() 
	{
	    a.clickGenericDropDown();
	    a.clickGeneric();
	  
	}

	@When("enters Pack Size as {string}")
	public void enters_pack_size_as(String string) 
	{
	    a.setPackSize(string);
	  
	}

	@Then("product should be added")
	public void product_should_be_added() 
	{
	    System.out.println("Product should be added");
	    driver.quit();
	  
	}




}
