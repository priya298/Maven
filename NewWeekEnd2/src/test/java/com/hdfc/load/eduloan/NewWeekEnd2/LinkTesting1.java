package com.hdfc.load.eduloan.NewWeekEnd2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class LinkTesting1 extends BasePage
{
	
  
  @BeforeClass
  @Parameters
  public void StartProcess(String browser) throws Exception 
  {
	 browserLaunch(browser, getData("flipkartUrl"));
  }

  @Test
  public void SingleLink()
  {
	  
  }
  
  @AfterClass
  public void EndProcess() 
  {
	  
  }

}
