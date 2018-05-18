package com.hdfc.load.eduloan.NewWeekEnd2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG extends BasePage
{
	
  @Test
  public void CustomerLogin() 
  {
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.id("email")).sendKeys("qatest@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("password");
	  driver.findElement(By.id("SubmitLogin")).click();
	  String actval= driver.findElement(By.xpath(".//*[@id='center_column']/h1")).getText();
	  String expval="My account";
	  
	  Assert.assertEquals(expval, actval);
	  Assert.assertTrue(actval.equalsIgnoreCase(expval));
	 // HomePage page=new HomePage(driver);
	 // page.login();
	 // Assert.assertTrue(page.verifyLoginPage().equalsIgnoreCase("My account"));
  }
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception 
  {
	  browserLaunch(browser,getData("ecommerceurl"));
  }

  @AfterClass
  public void afterClass() 
  {
	  
  }

}
