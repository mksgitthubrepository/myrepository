package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComOrderInfoPage 
{
	
	
	
	
	@FindBy(xpath = "//div[@class='order-overview']")private WebElement info;
	
	@FindBy(linkText  = "Log out")private WebElement logoutb;
	
	
	public NoPopComOrderInfoPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this );
		
	}
	
	
	public void orderinfo() 
	{
		System.out.println(info.getText());
		
	}
	public void logout() 
	{
		logoutb.click();
	}

}
