package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComConfirmOrderPage 

{
	
	@FindBy(xpath = "(//button[@type=\"button\"])[10]")private WebElement confirmbutton;
	
	
	public NoPopComConfirmOrderPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this );
		
	}
	
	
	public void confirmorder() 
	{
		
		confirmbutton.click();
	}

}
