package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'sign up')]")
	WebElement signUp;
	
	@FindBy(xpath="//body/div[1]/main[1]/section[1]/a[1]")
	WebElement regButton;
	
	@FindBy(xpath="//h2[contains(text(),'Register')]")
	WebElement registerLable;
	
	@FindBy(xpath="//input[@id='terms']")
	WebElement chkBox;
	
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifySignUPbtn() {

		return signUp.isDisplayed();
	}
	
	
	public boolean verifyReg() {

		regButton.click();

		return registerLable.isDisplayed();

	}
	
	public void tnc(){
		chkBox.click();
	}
	
	

}
