package ebayPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPage 
{
	
	
	@FindBy(id="signin-link")private WebElement SignINN;
	
	
	public EbayPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	
	
	public void signin() 
	{
		SignINN.click();
		
	}
}
