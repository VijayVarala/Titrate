package com.titrate.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser 
{
	public AddUser(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@src='/src/assets/sidebar-icons/usersgroup.svg']")
	WebElement users;
	
	@FindBy(xpath="//img[@src='/src/assets/add.svg']")
	WebElement adduser;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="last_name")
	WebElement lastname;
	
	@FindBy(name="user_name")
	WebElement username;
	
	@FindBy(name="phone_number")
	WebElement phoneno;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement btnAdd;
	
	public void clickUsers()
	{
		users.click();
	}
	
	public void clickAddUser() 
	{
		adduser.click();
	}
	
	public void setFirstName(String fname) 
	{
		firstname.sendKeys(fname);
	}
	
	public void setLastame(String lname) 
	{
		lastname.sendKeys(lname);
	}
	
	public void setUserName(String uname) 
	{
		username.sendKeys(uname);
	}
	
	public void setPhoneNo(String phno) 
	{
		phoneno.sendKeys(phno);
	}
	
	public void setEmail(String mail) 
	{
		email.sendKeys(mail);
	}
	
	public void clickAdd()
	{
		btnAdd.click();
	}
	

}
