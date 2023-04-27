package nopcommerce.stepdefinition;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import nopcommerce.pageobjects.Digitaldownloadspage;
import nopcommerce.pageobjects.Electronicspage;
import nopcommerce.pageobjects.Loginpage;
import nopcommerce.pageobjects.Pageobject;
import nopcommerce.testbase.Testbase;
import nopcommerce.utilities.Dropdowns;
import nopcommerce.utilities.Highlight;
import nopcommerce.utilities.ScreenRecorderUtil;
import nopcommerce.utilities.Screenshots;
import nopcommerce.utilities.StaticWaitpage;

public class Stepdefinition 
//extends Testbase
 {

	WebDriver driver;
	Screenshots ss=new Screenshots();
	
	@Given("open the browser")
//	@BeforeTest
//	@Parameters("browser")
	public void open_the_browser() throws Exception
	{
		ScreenRecorderUtil.startRecord("open_the_browser");	
		
//chrome		
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C://Users//tsesetti//Downloads//chromedriver_win32 (5)//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("user is on browser");
		driver.manage().window().maximize();
			
//firefox		
//		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//		System.out.println("user is on browser");
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
		
//edgedriver
//		System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
//		System.out.println("user is on browser");
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();	
		
		
		
		
//headless browser
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
//		  driver = new ChromeDriver(options);	
//		
		
		
//		OpenBrowser();
//		System.out.println(driver.getTitle());
//	
//		boolean flag ;
////		
//		String browserName0 = "Firefox";
//		this.browser0 = browserName0;
//		String browserName = "Chrome";
//		this.browser = browserName;
//		String browserName1 = "Edge";
//		this.browser1 = browserName1;
//		
//		//Check if parameter passed from TestNG is 'firefox'
//		if(browser0.equalsIgnoreCase("firefox")){
//		//create firefox instance
//		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		wait.staticShortWait();
//		
//		flag= true;
//		//Check if parameter passed as 'chrome'
////		 if(browser.equalsIgnoreCase("chrome")){
//		if(flag==true){
//		//set path to chromedriver.exe
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		wait.staticShortWait();
//		flag=false;
//		
//		
//		 if(flag == false){
//		//set path to Edge.exe
//		System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		wait.staticShortWait();
//		}
//		else{
//		//If no browser is passed throw exception
//		throw new Exception("Incorrect Browser");
//		}
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		}
//		}
		
		
//		if(browser.equalsIgnoreCase("firefox")){
//			//create firefox instance
//			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//			driver = new FirefoxDriver();
//			}
//			//Check if parameter passed as 'chrome'
//			else if(browser.equalsIgnoreCase("chrome")){
//			//set path to chromedriver.exe
//			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//			driver = new ChromeDriver();
//			}
//			else if(browser.equalsIgnoreCase("Edge")){
//			//set path to Edge.exe
//			System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
//			driver = new EdgeDriver();
//			}
//			else{
//			//If no browser is passed throw exception
//			throw new Exception("Incorrect Browser");
//			}
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			}
 
	}
	
	
	@When("user enter the url {string}")
	public void user_enter_the_url(String string)
	{
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@Then("click on the Register")
	public void click_on_the_register() throws IOException 
	{
		Highlight lite=new Highlight(driver);
		lite.high();
		ss.capture(driver);
		Pageobject reg=new Pageobject(driver);
		reg.register();
		ss.capture(driver);	
	}
	
	@When("click on the Gender")
	public void click_on_the_gender() throws Exception
	{
		Pageobject gen=new Pageobject(driver);
		gen.gender();
		ss.capture(driver);	
	}
	
	@Then("Enter a Firstname  {string}")
	public void enter_a_firstname(String string) throws Exception
	{
		Pageobject fname=new Pageobject(driver);
		fname.firstname(string);
		ss.capture(driver);	
	}
	
	@When("enter a Lastname {string}")
	public void enter_a_lastname(String string) throws IOException
	{
		Pageobject lname=new Pageobject(driver);
		lname.lastname(string);
		ss.capture(driver);
	}
	
	@Then("Enter date of birth")
	public void enter_date_of_birth() throws IOException
	{
		Dropdowns dp=new Dropdowns(driver);
		dp.day();
		ss.capture(driver);
		dp.month();
		ss.capture(driver);
		dp.year();
		ss.capture(driver);
	}
	
	@Then("Enter a Email {string}")
	public void enter_a_email(String string) throws IOException 
	{
		Pageobject email=new Pageobject(driver);
		email.mail(string);
		ss.capture(driver);
	}
	
	@Then("Enter a company name")
	public void enter_a_company_name() throws IOException
	{
		Pageobject cname=new Pageobject(driver);
		cname.comname();
		ss.capture(driver);
	}
	
	@When("enter the Password\"<password>\"")
	public void enter_the_password_password() throws IOException
	{
		Pageobject password=new Pageobject(driver);
		password.password(null);
		ss.capture(driver);
	}
	
	@Then("Enter a  ConfirmPassword {string}")
	public void enter_a_confirm_password(String string) throws IOException
	{
		Pageobject conpassword=new Pageobject(driver);
		conpassword.confirmpassword(null);
		ss.capture(driver);
	}
	
	@When("click on a Register button")
	public void click_on_a_register_button() throws IOException
	{
		Pageobject rp=new Pageobject(driver);
		 rp.Registerbutton();
		 ss.capture(driver);
	}
	
	@Then("click on the Login component")
	public void click_on_the_login_component() throws IOException
	{
		Highlight log=new Highlight(driver);
		log.login();
		ss.capture(driver);
		Loginpage reg=new Loginpage(driver);
		reg.Login();
		ss.capture(driver);
	}
	
	@When("enter the previousemail {string}")
	public void enter_the_previousemail(String string) throws IOException
	{
		Loginpage email=new Loginpage(driver);
		email.existingmail(string);
		ss.capture(driver);
	}
	
	@When("enter the previouspassword {string}")
	public void enter_the_previouspassword(String string) throws IOException
	{
		Loginpage email=new Loginpage(driver);
		email.existingpassword(string);
		ss.capture(driver);
	}
	
	@Then("click on the login button")
	public void click_on_the_login_button() throws IOException
	{
		Loginpage rp=new Loginpage(driver);
		 rp.loggedin();
		 ss.capture(driver);
	}
	
	@When("Click on Electronics button")
	public void click_on_electronics_button() throws IOException
	{
		 Highlight log=new Highlight(driver);
		 log.ele();
		 ss.capture(driver);
		 Electronicspage Ele=new Electronicspage(driver);
		 Ele.electronics();
		 ss.capture(driver);
		 Highlight cam=new Highlight(driver);
		 cam.camphoto();
		 ss.capture(driver);
		 Ele.camphoto();
		 ss.capture(driver);
	}
	
	@Then("Select dropdowns")
	public void select_dropdowns() throws IOException 
	{
		Dropdowns dp=new Dropdowns(driver);
		dp.sortby();
		ss.capture(driver);
		dp.display();
		ss.capture(driver);
	}
	
	@When("Add to cart")
	public void add_to_cart() throws IOException
	{
		 Electronicspage addcart=new Electronicspage(driver);
		 addcart.acart();
		 ss.capture(driver);
		 addcart.shoppingcart();
		 ss.capture(driver);
		 Electronicspage addcart2=new Electronicspage(driver);
		 addcart2.cart();
		 ss.capture(driver);
		 Dropdowns addcart1=new Dropdowns(driver);
		 addcart1.sortby1();
		 ss.capture(driver);
		 addcart1.display1();
		 ss.capture(driver);
	}
	
	@Then("Click on cellphones")
	public void click_on_cellphones() throws IOException
	{
		 Electronicspage cell=new Electronicspage(driver);
		 cell.cellcart();
		 ss.capture(driver);
	}
	
	@Then("click on digitaldownloads")
	public void click_on_digitaldownloads() throws Exception
	{
		Highlight ddownloads=new Highlight(driver);
		ddownloads.digital();
		ss.capture(driver);
		Digitaldownloadspage digital=new Digitaldownloadspage(driver);
		digital.downloads();
		ss.capture(driver);
		Dropdowns position=new Dropdowns(driver);
		position.sort();
		ss.capture(driver);
		position.dis();
		ss.capture(driver);
		Digitaldownloadspage addcart=new Digitaldownloadspage(driver);
		addcart.addcart1();
		ss.capture(driver);
		
		ScreenRecorderUtil.stopRecord();
	}
		     
}
	


