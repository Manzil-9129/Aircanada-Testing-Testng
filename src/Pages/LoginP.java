package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginP {

WebDriver driver;

public void openBrowser() {

	System.setProperty("webdriver.gecko.driver","C:\\\\Selenium Project\\\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.udemy.com/join/login-popup/");
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
}
	
public void CloseBrowser() throws InterruptedException {
	Thread.sleep(500);
	driver.quit();
	
}
public String error() {
	
	String err=driver.getCurrentUrl();
	
	return err;
}

public void Login(String email,String password) throws InterruptedException {
	driver.findElement(By.cssSelector("#email--1")).sendKeys(email);
	driver.findElement(By.cssSelector("#id_password")).sendKeys(password);
	driver.findElement(By.cssSelector("#submit-id-submit")).click();
	Thread.sleep(2000);
	
	
}
	

	
	
	
	
}



