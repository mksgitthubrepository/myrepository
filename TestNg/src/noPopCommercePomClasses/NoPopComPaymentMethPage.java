package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComPaymentMethPage 
{
	
	
	@FindBy(xpath = "//input[@id='paymentmethod_1']")private WebElement card;
	@FindBy(xpath = "(//button[@name='save'])[2]")private WebElement continueb;
	
	
	
	public NoPopComPaymentMethPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void cardtypeselect(WebDriver driver) 
	{
		
		card.click();
		continueb.click();
		
		
	}

}
