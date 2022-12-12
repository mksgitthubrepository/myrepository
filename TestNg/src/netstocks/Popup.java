package netstocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup 
{
     @FindBy(xpath ="(//button[@class='close'])[19]//span") private WebElement popup;
	
	
	public Popup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void popupclose() 
	{
		popup.click();
	}

}
