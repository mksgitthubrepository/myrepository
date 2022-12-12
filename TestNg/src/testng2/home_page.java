package testng2;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page 
{
@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement name;
@FindBy(xpath = "//span[@id='undefined_dropdown_btn']")private  WebElement dd;
@FindBy(xpath = "(//div[@class='uqbo_NEcoyS6gkP91WmvE _1efklOF1Q_zOjHS0rpulvi'])[2]") private WebElement logout;
	
	public home_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	public void name() 
	{
		
		System.out.println(name.getText());
	}
	
	public String actualname(WebDriver driver) throws IOException
	{
		String Actualname = name.getText();
		Commonly_use_methods.screenshort(driver);
		
	    return Actualname;
	    
	
		
		
		
    }
	
	public void dropd() 
	{
		dd.click();
		
	}
	
	public void logout() 
	{
		logout.click();
	}
	
	

}
