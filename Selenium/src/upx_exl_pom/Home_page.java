package upx_exl_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement name;

	
	public Home_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void name() 
	{
		
		System.out.println(name.getText());
	}
	
	
	
	
	
}


