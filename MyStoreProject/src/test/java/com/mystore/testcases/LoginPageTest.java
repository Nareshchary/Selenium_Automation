/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

/**
 * @author nareshchary
 *
 */
public class LoginPageTest extends BaseClass {
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void loginTest() throws Throwable {
		Log.startTestCase("loginTest");
		indexPage = new IndexPage();
		Log.info("user going to click on signin");
		loginPage = indexPage.clickOnSignIn();
		Log.info("enter username and password");
		homePage =  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actURL = homePage.getCurrURL();
		String expURL ="http://automationpractice.com/index.php?controller=my-account";
		Log.info("verifying if user is able to login");
		Assert.assertEquals(actURL, expURL);
		Log.info("login is success");
		Log.endTestCase("loginTest");
	}

}
