package nopcommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import nopcommerce.utilities.StaticWaitpage;

public class Digitaldownloadspage {

	WebDriver driver;
	StaticWaitpage wait=new StaticWaitpage();
	
	public Digitaldownloadspage(WebDriver driver) {
		this.driver=driver;
	}
	
//locators
	By digitaldownloads=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
	By addcart=By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    By shoppingcart=By.xpath("//a[normalize-space()='shopping cart']");
    By termsofservice=By.xpath("//input[@id='termsofservice']");
    By checkout=By.xpath("//button[@id='checkout']");
	
//methods
	public void downloads() 
	{
		driver.findElement(digitaldownloads).click();
		wait.staticShortWait();
	}

	public void addcart1() 
	{
		driver.findElement(addcart).click();
		wait.staticShortWait();	
		driver.findElement(shoppingcart).click();
		wait.staticShortWait();
		driver.findElement(termsofservice).click();
		wait.staticShortWait();
		driver.findElement(checkout).click();
		wait.staticShortWait();
	}
	
}
