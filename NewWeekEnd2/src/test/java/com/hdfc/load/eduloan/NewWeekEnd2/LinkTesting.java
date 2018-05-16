package com.hdfc.load.eduloan.NewWeekEnd2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinkTesting extends BasePage
{
	
  
  @BeforeMethod
  @Parameters("browser")
  public void vishnu(String browser) throws Exception
  {
	  browserLaunch(browser, getData("flipkartUrl"));
  }
  
  @Test
  public void linkTesting()
  {
	  driver.findElement(By.linkText("Login & Signup")).click();
  }
  

  @AfterMethod
  public void priya() 
  {
	 driver.close(); 
  }

}
