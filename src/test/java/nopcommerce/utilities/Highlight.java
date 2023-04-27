package nopcommerce.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight
{
	
	public Highlight(WebDriver driver)
	{
		this.driver=driver;
	}

	WebDriver driver;
	
//locators
	By register=By.xpath("//a[@class='ico-register']");
	By login=By.xpath("//a[@class='ico-login']");
	By electronics=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
	By digitaldownloads=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
	By camphoto=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']");
	By cellphones=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
	
//methods
	public void high()
	{
		WebElement reg=driver.findElement(register);
//assertion		
		Assert.assertEquals(true, reg.isDisplayed());
		System.out.println("register logo is displayed – Assert passed");
		
		if(reg.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",reg);    
		System.out.println("register icon is displayed");
		}
		else 
		{
		System.out.println("register icon is not displayed");
	    }	
	}

	public void login()
	{
		WebElement progress=driver.findElement(login);
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("login icon is displayed");
		}
		else 
		{
		System.out.println("login icon is not displayed");
	    }
		
	}

	public void ele()
	{
		WebElement progress=driver.findElement(electronics);
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("electronics module icon is displayed");
		}
		else 
		{
		System.out.println("electronics module is not displayed");
	    }
		
	}

	public void digital()
	{
		WebElement progress=driver.findElement(digitaldownloads);
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("digitaldownloads module icon is displayed");
		}
		else 
		{
		System.out.println("digitaldownloads module is not displayed");
	    }
		
	}

	public void camphoto()
	{
		WebElement progress=driver.findElement(camphoto);
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("camphoto module icon is displayed");
		}
		else 
		{
		System.out.println("camphoto module is not displayed");
	    }
	}

	public void cell()
	{
		WebElement progress=driver.findElement(cellphones);
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("camphoto module icon is displayed");
		}
		else 
		{
		System.out.println("camphoto module is not displayed");
	    }
		
	}
}
