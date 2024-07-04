package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAssignRole {
	
	public EditAssignRole(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/assignedrole.svg']")
	WebElement assignroleicon;
	
	@FindBy(xpath="(//*[@data-testid='EditNoteIcon'])[1]")
	WebElement edit;
	
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[2]")
	WebElement usersdropdown;

	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement users;
	

	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[3]")
	WebElement roledropdown;

	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement role;
	

	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[2]")
	WebElement imprestdropdown;

	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement imprest;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement save;
	public void clickAssinRoleIcon() {
		assignroleicon.click();
	}
	public void clickEdit() {
		edit.click();
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
		save.click();
	} 



}
