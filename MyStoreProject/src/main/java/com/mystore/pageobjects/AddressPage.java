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
public class AddressPage extends BaseClass {
	Action action = new Action();
	
	@FindBy(xpath="//span[text()='proceed to checkout']")
	WebElement proceedToCheckout;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ShippingPage clickOnCheckOut() {
		action.click(driver, proceedToCheckout);
		return new ShippingPage();
		
	}

	
	

}
