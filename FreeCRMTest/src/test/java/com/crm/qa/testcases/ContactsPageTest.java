
package com.crm.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;

	String sheetName = "contacts";

	public ContactsPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException {

		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.runTimeInfo("error", "login successful");
		// testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
		
	}

	
	  @Test(priority = 1) 
	  public void verifyContactsPageLabel() {
	  Assert.assertTrue(contactsPage.verifyContactsLabel(),
	  "contacts label is missing on the page"); }
	  
	  @Test(priority = 2) 
	  public void selectSingleContactsTest() {
	  contactsPage.selectContactsByName("Amit Chandrakant Kadam");
	  
	  }
	  
	  @Test(priority = 3) 
	  public void selectMultipleContactsTest() {
	  contactsPage.selectContactsByName("Harshad Shriram Wani");
	  contactsPage.selectContactsByName("Amit Chandrakant Kadam");
	  
	  }
	 

//	@DataProvider
//	public Object[][] getCRMTestData() throws InvalidFormatException {
//		Object data[][] = TestUtil.getTestData(sheetName);
//		return data;
//	}
//
//	@Test(priority = 4, dataProvider = "getCRMTestData")
//	public void validateCreateNewContact(String firstName, String lastName, String company) {
//		homePage.clickOnNewContactLink();
//		contactsPage.createNewContact(firstName, lastName, company);
		
//		}
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
