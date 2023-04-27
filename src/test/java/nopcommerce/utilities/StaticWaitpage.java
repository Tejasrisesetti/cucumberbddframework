package nopcommerce.utilities;

import nopcommerce.constants.Constants;

public class StaticWaitpage
{

	public static void staticShortWait()
	{
		try 
		{
			Thread.sleep(Constants.SHORT_WAIT);
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
