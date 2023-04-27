package nopcommerce.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Dropdowns
{

	WebDriver driver;
	StaticWaitpage time=new StaticWaitpage();
	
	public Dropdowns(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void day()
	{
		WebElement day=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select d=new Select(day);
		d.selectByIndex(12);
		
//		Assert.assertEquals(true, day.isSelected()); 
//		System.out.println("Radio button is selected – Assert passed");
		time.staticShortWait();
	}
    public void month()
    {
		WebElement month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		Select m=new Select(month);
		m.selectByIndex(1);
		time.staticShortWait();
	}
    
    public void year() 
    {
		WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		Select y=new Select(year);
		y.selectByIndex(21);
		time.staticShortWait();
	}
    
	public void sortby()
	{
		 WebElement sortby=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 Select sc=new Select(sortby);
		 sc.selectByIndex(2);
		 time.staticShortWait();
	}
	
	public void display()
	{
		WebElement dispaly=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select ds=new Select(dispaly);
		ds.selectByIndex(2);
		time.staticShortWait();	
	}

	public void sortby1()
	{
		WebElement sortby1=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sb=new Select(sortby1);
		sb.selectByIndex(2);
		time.staticShortWait();	
	}
	
	public void display1()
	{
		WebElement sortby1=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select sb=new Select(sortby1);
		sb.selectByIndex(2);
		time.staticShortWait();	
	}
	
	public void sort() 
	{
		WebElement sortby1=driver.findElement(By.xpath("(//select[@id='products-orderby'])[1]"));
		Select sb=new Select(sortby1);
		sb.selectByIndex(4);
		time.staticShortWait();	
	}
	
	public void dis()
	{
		WebElement sortby1=driver.findElement(By.xpath("(//select[@id='products-pagesize'])[1]"));
		Select sb=new Select(sortby1);
		sb.selectByIndex(2);
		time.staticShortWait();
	}

}
