package nopcommerce.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class xcel
{
	public static Properties getPropertyObject() throws IOException
	{
		FileInputStream fp = new FileInputStream("C:\\Users\\tsesetti\\eclipse-workspace\\Cucumberbddframework\\src\\main\\resources\\config");
		Properties prop = new Properties();
		prop.load(fp);
		return prop;
	}

	public CharSequence getFirstname() throws IOException
	{
		return getPropertyObject().getProperty("firstname");
	}

	public CharSequence getlastname() throws IOException
	{
		return getPropertyObject().getProperty("lastname");
	}

	public CharSequence getemail() throws IOException 
	{
		return getPropertyObject().getProperty("email");
	}

	public CharSequence getcompanyname() throws IOException
	{
		return getPropertyObject().getProperty("companyname");
	}

	public CharSequence getpwd() throws IOException 
	{
		return getPropertyObject().getProperty("password");
	}

	public CharSequence getconfpwd() throws IOException
	{
		return getPropertyObject().getProperty("confirmpassword");
	}


//	public String getUrl() throws IOException {
//		return getPropertyObject().getProperty("url");
//	}
}
