/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author nareshchary
 *
 */
public class LoginPage extends BaseClass{
	Action action = new Action();

	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(id="email_create")
	WebElement emailForNewAccount;
	
	@FindBy(id="SubmitLogin")
	WebElement SignInBtn;
	
	@FindBy(name="SubmitCreate")
	WebElement createNewAccBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public HomePage login(String uname, String pswd) {
		action.type(username, uname);
		action.type(password, pswd);
		action.click(driver, SignInBtn);
		return new HomePage();
	}
	public AddressPage login1(String uname, String pswd) {
		action.type(username, uname);
		action.type(password, pswd);
		action.click(driver, SignInBtn);
		return new AddressPage();
	}
	public AccountCreationPage createNewAccount(String newEmail) {
		action.type(emailForNewAccount, newEmail);
		return new AccountCreationPage();
	}

}