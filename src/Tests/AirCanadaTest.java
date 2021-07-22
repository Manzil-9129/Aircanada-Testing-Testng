package Tests;

import org.testng.annotations.Test;

import Data.AircanadaData;
import Pages.LoginP;
import Pages.TicketPage;
import Utilities.Xls_Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AirCanadaTest {
 LoginP L=new LoginP();
 TicketPage ticketpage=new TicketPage();
 WebDriver driver;	
 
 AircanadaData data1=new AircanadaData();
  
 
 @Test(priority=1)
  public void TicketBooking() throws InterruptedException {
   ticketpage.from_To(AircanadaData.depart, AircanadaData.arrival);
   Thread.sleep(1000);
  
   }
 
  @Test(priority=2,groups= {"hk"})
  public void hh() throws InterruptedException {
	  
  ticketpage.Hover();
  
  }
  
  
  @Test(priority=3,dependsOnMethods= {"hh"},groups= {"hk"})
 public void ff() throws InterruptedException {
 
 ticketpage.Hover();
 Thread.sleep(500);
 ticketpage.radioB();
 
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
  ticketpage.openBrowser();
  ticketpage.openwebsite();
  
  }
  
  @AfterMethod
  public void afertMethod() throws InterruptedException {
	 ticketpage.CloseBrowser();
  }

}
