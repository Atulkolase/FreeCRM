package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.util.TestUtil;

public class SignupPageTest extends TestBase {

	TestUtil testUtil;
	SignUpPage signupPG;

	public SignupPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException {
		initialization();
		signupPG = new SignUpPage();
		testUtil = new TestUtil();
		TestUtil.runTimeInfo("error", "login successful");
	}

	@Test(priority = 1)
	public void verifySignupButton() {

		Assert.assertTrue(signupPG.verifySignUPbtn(), "SignUp Button is missing on the page");
	}

	@Test(priority = 2)
	public void verifyRegistrationPg() {

		Assert.assertTrue(signupPG.verifyReg(), "Registration Page Not Available");

	}

	@Test(priority = 3)
	public void termNconditionBox() {

		signupPG.tnc();

	}
	
	

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
