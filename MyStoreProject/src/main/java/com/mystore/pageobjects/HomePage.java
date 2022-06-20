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
	public class HomePage extends BaseClass {
	Action action = new Action();

	@FindBy(xpath= "//span[text()= 'My wishlists']")
	WebElement myWishList;
	
	@FindBy(xpath= "//span[text()= 'Order history and details']")
	WebElement orderHistory;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public boolean validateMyWishList() {
		return action.isDisplayed(driver, myWishList);
		
			}
	public void validateOrderHistory() {
		action.isDisplayed(driver, orderHistory);
	}

}
