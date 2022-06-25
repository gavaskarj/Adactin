package org.hexa.pages;

import org.hexa.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
// 1. Create constructor 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
// Locators 	
	@FindBy(id ="username")
	private WebElement txtUserName;   // Encapsulation 
	
	@FindBy(id ="password")
	private WebElement txtUserPass; 
	
	@FindBy(id ="login")
	private WebElement btnLogin;

	
	// Generate getters  --> Right click --> Source --> selectgetters 
		
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtUserPass() {
		return txtUserPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
// Create method to execute 
	
	public void TC1(String userName, String passWord) {
		sentValues(getTxtUserName(), userName );
		sentValues(getTxtUserPass(), passWord );
		elementClick(btnLogin);
		
	}
	
	
	 
}
