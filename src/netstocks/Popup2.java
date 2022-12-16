package netstocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup2 
{
	
	
	   @FindBy(xpath ="(//a[@class='neobutton'])[25]") private WebElement popup1;
		
		
		public Popup2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void ppclose() 
		{
			popup1.click();
		}

}
