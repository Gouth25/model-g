package businesslib;

import genericlib.Constants;
import genericlib.Driver;
import pagefactory.Common_CPF;
import pagefactory.Logout;

public class Common_CBL 
{
	public static void login() throws InterruptedException
	{
		Driver.dr=Driver.getbrowser();
		Thread.sleep(5000);
		Driver.dr.get(Constants.url);
		Driver.dr.manage().window().maximize();
		Driver.dr.findElement(Common_CPF.un).sendKeys(Constants.userid);
		Driver.dr.findElement(Common_CPF.pwd).sendKeys(Constants.password);
		Driver.dr.findElement(Common_CPF.lgnbtn).click();
		Thread.sleep(2000);
	}
	
	public static void logout() throws InterruptedException
	{
		Driver.dr.findElement(Logout.Btn).click();
		Thread.sleep(2000);
		Driver.dr.findElement(Logout.lgbtn).click();
		Thread.sleep(2000);
	
	}

}