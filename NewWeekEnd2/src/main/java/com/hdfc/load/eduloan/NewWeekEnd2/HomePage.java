package com.hdfc.load.eduloan.NewWeekEnd2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText="sign in")WebElement signIn;
	@FindBy(id="email")WebElement email;
	@FindBy(id="passwd")WebElement passwd;
	@FindBy(id="SubmitLogin")WebElement submitlogin;
	@FindBy(xpath="//h1[test()='My account']")WebElement verifyAccount;
	
	
      public HomePage(WebDriver driver)
      {
		PageFactory.initElements(driver, this);
	}



	public void login()
	{
		signIn.click();
		email.sendKeys("qatest@gmail.com");
	    passwd.sendKeys("password");
	    submitlogin.click();
	}
	
	public String verifyLoginPage()
	{
		return verifyAccount.getText();
	}
}
