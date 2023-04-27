package nopcommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import nopcommerce.constants.Constants;
import nopcommerce.utilities.Highlight;
import nopcommerce.utilities.StaticWaitpage;

public class Electronicspage {

	WebDriver driver;
	StaticWaitpage timeout=new StaticWaitpage();
	
	public Electronicspage(WebDriver driver) {
		this.driver=driver;
	}
	
//locators
	By electronics=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
	By camphoto=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']");
	By acart=By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
	By shoppingcart=By.xpath("//button[@id='add-to-cart-button-14']");
	By cart=By.xpath("//a[normalize-space()='shopping cart']");
	By termsofservice=By.xpath("//input[@id='termsofservice']");
	By checkout=By.xpath("//button[@id='checkout']");
	By mobile=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
	By cellphones=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
	By cellcart=By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
	By shoppingcart1=By.xpath("//a[normalize-space()='shopping cart']");
	By termsofservice1=By.xpath("//input[@id='termsofservice']");
	By checkout1=By.xpath("//button[@id='checkout']");
	By city=By.xpath("//input[@id='BillingNewAddress_City']");
	
	
	
//methods
	public void electronics() 
	{
		Actions a1 = new Actions(driver);
		WebElement mainMenu = driver.findElement(electronics);
		a1.moveToElement(mainMenu).build().perform();
		timeout.staticShortWait();
    }
	
	public void camphoto()
	{
		driver.findElement(camphoto).click();
		timeout.staticShortWait();
    }
	
	public void acart()
	{
        driver.findElement(acart).click();
		timeout.staticShortWait();
    }
	
	public void shoppingcart() 
	{
		 driver.findElement(shoppingcart).click();
		 timeout.staticShortWait();
	}
	
	public void cart() 
	{
		driver.findElement(cart).click();
		timeout.staticShortWait();
		driver.findElement(termsofservice).click();
		timeout.staticShortWait();
		driver.findElement(checkout).click();
		timeout.staticShortWait();
		
		
		Actions a2 = new Actions(driver);
		WebElement mainMenu = driver.findElement(mobile);
		a2.moveToElement(mainMenu).build().perform();
		timeout.staticShortWait();
		
		driver.findElement(cellphones).click();
		timeout.staticShortWait();	
	}
	
	public void cellcart() 
	{
		driver.findElement(cellcart).click();
		timeout.staticShortWait();
		driver.findElement(shoppingcart1).click();
		timeout.staticShortWait();	
		driver.findElement(termsofservice1).click();
		timeout.staticShortWait();	
		driver.findElement(checkout1).click();
		timeout.staticShortWait();	
	}
}
