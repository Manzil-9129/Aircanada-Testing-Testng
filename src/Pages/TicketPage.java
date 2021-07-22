package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TicketPage {
WebDriver driver;
Actions hover;

public void openwebsite() throws InterruptedException {
	driver.get("https://www.aircanada.com/us/en/aco/home.html#/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
}

public void CloseBrowser() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
	
}

public void openBrowser() {

	System.setProperty("webdriver.gecko.driver","C:\\\\Selenium Project\\\\geckodriver.exe");
	driver=new FirefoxDriver();
	
}


public void from_To(String Departure,String Arrival) throws InterruptedException {
	//Selects the Departure city 
	driver.findElement(By.cssSelector("#origin_R_0")).sendKeys(Departure);
	driver.findElement(By.cssSelector("span[class='airport-name']")).click();

	//Selects the Arrival city 
	driver.findElement(By.cssSelector("#destination_R_0")).sendKeys(Arrival);
	driver.findElement(By.xpath("//ul[@id='flightLocationListDestinationId0']/li[2]")).click();
    Thread.sleep(1000);
	
    //Selects the Departure date 
    driver.findElement(By.xpath("//div[@class='glyph-holder glyph-left-holder form-control date-holder padding-active hidden-xs sr-only-depart-date-0']/span")).click();
	driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[2]/td[3]")).click();
	
	//Click to change the page 
	driver.findElement(By.cssSelector("span[class='ac-icon arrow-right  ac-1nx month-change-arrow next-arrow']")).click();
	
	//Selects the Return Date 
	driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[2]/td[6]")).click();	
	driver.findElement(By.cssSelector("#calendarSelectActionBtn")).click();
	Thread.sleep(1000);
	
	//Clicks to Generate the ticket.....
	driver.findElement(By.cssSelector("input[value='Find']")).click();
	
}	
	
public void Hover() throws InterruptedException {
	
    hover=new Actions(driver);
    
	//Finds the HoverElement 
    WebElement element=driver.findElement(By.cssSelector("#flyPrimaryNavAnchor"));

    //Performs action on HoverElement
    hover.moveToElement(element).build().perform();
    
    //Location for the Fly webElement
    WebElement flyelement=driver.findElement(By.xpath("(//section[@class='sub-nav-section col-xs-12 col-sm-4 col-md-4 col-lg-4'])[12]/ul/li"));
    //Checks for the error
    //Assert.assertEquals(flyelement.getText(),"Flight Status");
    Thread.sleep(500);
    Assert.assertTrue(flyelement.isDisplayed(),"The Hover is working");
	

	
}
 
public void radioB() throws InterruptedException {
	
	//Hover on Fly and Selects FlightStatus
	driver.findElement(By.xpath("(//section[@class='sub-nav-section col-xs-12 col-sm-4 col-md-4 col-lg-4'])[12]/ul/li")).click();
    Thread.sleep(1500);
	
    //Select the Radio Button.....
    WebElement radiobutton=driver.findElement(By.xpath("(//label[@class='label-inline'])[2]/span"));
    radiobutton.click();
   
	Assert.assertTrue(radiobutton.isSelected(),"Radio button is Enabled");
    Thread.sleep(1000);
}
   

	

}
