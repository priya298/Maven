package com.hdfc.load.eduloan.NewWeekEnd2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class LinkTesting1 extends BasePage
{
	
  
  @BeforeClass
  @Parameters
  public void StartProcess(String browser) throws Exception 
  {
	 browserLaunch(browser, getData("eenaduurl"));
  }

  @Test
  public void SingleLink()
  {
	  driver.findElement(By.linkText("Register Now")).click();
  }
  
  @AfterClass
  public void EndProcess() 
  {
	  
  }

}
