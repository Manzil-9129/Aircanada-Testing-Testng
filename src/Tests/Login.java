package Tests;

import org.testng.annotations.Test;

import Data.LoginData;
import Pages.LoginP;
import Utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Login {
    WebDriver driver;
	LoginP Lpage=new LoginP();
	LoginData data2=new LoginData();
	
  @Test
  public void LoginUdemy() throws InterruptedException {
	  Lpage.Login(data2.email,data2.password);
	  Assert.assertTrue(Lpage.error().equals("udemy.com"));
	 }
  @BeforeMethod
  public void beforeMethod() {
	  Lpage.openBrowser();
	  
	  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  Lpage.CloseBrowser(); 
  }

}
