package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neoStoxUtility.NeoStoxUtility;

public class Popup1 
{

    @FindBy(xpath ="(//button[@class='close'])[19]//span") private WebElement popup;
	
	
	public Popup1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void popupclose(WebDriver driver) 
	{
	
		NeoStoxUtility.Wait(driver, 5);
		popup.click();
	}

}
