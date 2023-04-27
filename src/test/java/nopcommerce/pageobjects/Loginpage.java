package nopcommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import nopcommerce.constants.Constants;
import nopcommerce.utilities.StaticWaitpage;

public class Loginpage {

	WebDriver driver;
	
	StaticWaitpage page=new StaticWaitpage();
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
//locators
	By login=By.xpath("//a[normalize-space()='Log in']");
	By existingmail=By.xpath("//input[@id='Email']");
	By existingpassword=By.xpath("//input[@id='Password']");
	By loggedin=By.xpath("//button[normalize-space()='Log in']");

	
//methods
	public void Login()
	{
		driver.findElement(login).click();	
		page.staticShortWait();
	}
	
	public void existingmail(String preemail)
	{
		driver.findElement(existingmail).sendKeys(Constants.preemail);
		page.staticShortWait();
	}
	
	public void existingpassword(String prepassword)
	{
		driver.findElement(existingpassword).sendKeys(Constants.prepassword);
		page.staticShortWait();
	}
	
	public   void loggedin()
	{
		driver.findElement(loggedin).click();	
		page.staticShortWait();
	}

	
}
