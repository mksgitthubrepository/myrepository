package policybazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import upx_exl_pom.Home_page;

public class homepage 
{
	
	    @FindBy(xpath = "(//div[@class='shadowHandlerBox'])[1]") private  WebElement  insurance;
		
		
		public homepage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
	
		public void termlife() 
		{
		
			insurance.click();
		} 
		
	

}
