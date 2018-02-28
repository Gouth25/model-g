package businesslib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;

import genericlib.Driver;
import genericlib.Excel;
import jdk.nashorn.internal.ir.ContinueNode;
import pagefactory.StateMaster_CPF;

public class StateMaster_CBL 
{
	public static void statemaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Driver.dr.findElement(StateMaster_CPF.admin).click();
		Driver.dr.findElement(StateMaster_CPF.state).click();
		Thread.sleep(2000);
		//Actions act=new Actions(Driver.dr);
		/*WebElement wb=Driver.dr.findElement(StateMaster_CPF.stateName);
		act.moveToElement(wb).build().perform();
		wb.sendKeys("Chitradurga");*/
		
		Driver.dr.findElement(StateMaster_CPF.stateName).sendKeys(Excel.excel(1,1));
		Driver.dr.findElement(StateMaster_CPF.stateCode).sendKeys(Excel.excel(1,2));
		Driver.dr.findElement(StateMaster_CPF.addstate).click();
		
		
	} 


}
