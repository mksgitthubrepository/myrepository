package testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passcode_page 
 {

	
@FindBy(name="yob") private WebElement yob;
	
	
	public Passcode_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void yearofbirth(String year) 
	{
		yob.sendKeys(year);
	}
}
