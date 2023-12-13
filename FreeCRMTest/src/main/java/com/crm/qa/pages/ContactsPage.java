package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]")
	WebElement contactBtn;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	//@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/div[3]/button[1]")
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	WebElement newContact;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="company")
	WebElement company;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]/text()")
	WebElement saveBtn;
	
	@FindBy(xpath = "//a[contains(text(),'1')]")
	WebElement dashB;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]")
	WebElement ui;
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		contactBtn.click();
		
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectContactsByName(String name) {
		dashB.click();
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//ancestor::div[@class=\"table-wrapper\"]")).click();
		////a[contains(text(),'Amit Chandrakant Kadam')]//ancestor::div[@class="table-wrapper"]
		
	}
		
	
//	public void createNewContact(String ftName, String ltName, String comp){
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(ui).perform();
////		newContact.click();
//		
//		
//		Select select = new Select(driver.findElement(By.name("first_name")));
//		select.selectByVisibleText("first_name");
//		
//		firstName.clear();
//		firstName.sendKeys(ftName);
//		lastName.clear();
//		lastName.sendKeys(ltName);
//		company.clear();
//		company.sendKeys(comp);
//		
//		saveBtn.click();
//		contactBtn.click();
//		
//	}
	
	
	

}
