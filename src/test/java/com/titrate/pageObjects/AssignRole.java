package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignRole {
	public AssignRole(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/assignedrole.svg']")
	WebElement assignroleicon;

	@FindBy(xpath="//img[@src='/src/assets/add.svg']")
	WebElement assignrole;

	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[4]")
	WebElement usersdropdown;

	@FindBy(xpath="(//li[@role='option'])[1]")
	WebElement users;
	

	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[3]")
	WebElement roledropdown;

	@FindBy(xpath="(//li[@role='option'])[1]")
	WebElement role;
	

	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[2]")
	WebElement imprestdropdown;

	@FindBy(xpath="(//li[@role='option'])[1]")
	WebElement imprest;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement add;
	
	public void clickAssinRoleIcon() {
		assignroleicon.click();
	}
	public void clickAssinRole() {
		assignrole.click();
	}
	public void clickUsersDropDown() {
		usersdropdown.click();
	}
	public void clickUsers() {
		users.click();
	}
	public void clickRoleDropDown() {
		roledropdown.click();
	}
	public void clickRole() {
		role.click();
	}
	public void clickImprestDropDown() {
		imprestdropdown.click();
	}
	public void clickImprest() {
		imprest.click();
	}
	public void clickAdd() {
		add.click();
	}

}
