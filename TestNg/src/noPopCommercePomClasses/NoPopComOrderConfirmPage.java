package noPopCommercePomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComOrderConfirmPage 
{
	
	
	@FindBy(linkText = "Click here for order details.") private WebElement  orderdetails;
	
	
	public NoPopComOrderConfirmPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void orderdetails() 
	{
		orderdetails.click();
		
	}

}
