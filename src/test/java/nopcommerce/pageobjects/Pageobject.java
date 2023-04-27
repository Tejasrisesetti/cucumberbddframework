package nopcommerce.pageobjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Then;
import nopcommerce.constants.Constants;
import nopcommerce.testbase.Testbase;
import nopcommerce.utilities.StaticWaitpage;
import nopcommerce.utilities.xcel;

public class Pageobject  {
	WebDriver driver;
	
	StaticWaitpage wait=new StaticWaitpage();
	
	
	public Pageobject(WebDriver driver) {
		this.driver=driver;
	}
	
//locators
	By register=By.xpath("//a[normalize-space()='Register']");
	By gender=By.xpath("//input[@id='gender-female']");
	By fname=By.xpath("//input[@id='FirstName']");
	By lname=By.xpath("//input[@id='LastName']");
	By mail=By.xpath("//input[@id='Email']");
	By company=By.xpath("//input[@id='Company']");
	By password=By.xpath("//input[@id='Password']");
	By conpassword=By.xpath("//input[@id='ConfirmPassword']");
	By button=By.xpath("//button[@id='register-button']");
	xcel readwrite=new xcel();
	
//methods
	public void register() throws IOException
	{
		driver.findElement(register).click();	
		wait.staticShortWait();
	}
	
	public void gender()
	 {
		WebElement gen=driver.findElement(gender);
		gen.click();
	    Assert.assertEquals(true, gen.isSelected()); 
	    System.out.println("gender button is selected – Assert passed");
	    wait.staticShortWait();
	 }
	
	public   void firstname(String fsname) throws IOException
	{
		WebElement  firname=driver.findElement(fname);
		firname.sendKeys(readwrite.getFirstname());	
		Assert.assertEquals(true, firname.isDisplayed());  
		System.out.println("Element is enabled – Assert passed");
		wait.staticShortWait();
	}
	
	public   void lastname(String lsname) throws IOException
	{
		WebElement  lasname=driver.findElement(lname);
		lasname.sendKeys(readwrite.getlastname());
		Assert.assertEquals(true, lasname.isEnabled());  
		System.out.println("Element is enabled – Assert passed");
		wait.staticShortWait();
	}
	
	public   void mail(String email) throws IOException
	{
		driver.findElement(mail).sendKeys(readwrite.getemail());	
		wait.staticShortWait();
	}
	
	public void comname() throws IOException 
	{
		driver.findElement(company).sendKeys(readwrite.getcompanyname());	
		wait.staticShortWait();
	}
	
	public   void password(String pwd) throws IOException
	{
		driver.findElement(password).sendKeys(readwrite.getpwd());
		wait.staticShortWait();
	}
	
	public   void confirmpassword(String confpwd) throws IOException
	{
		driver.findElement(conpassword).sendKeys(readwrite.getconfpwd());	
		wait.staticShortWait();
	}
	
	public   void Registerbutton()
	{
		driver.findElement(button).click();
		wait.staticShortWait();
	}

}



	
      
      

