package upx_exl_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YOB_page 
{
	
	
	@FindBy(name="yob")private WebElement birthyear;
	
	public YOB_page(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void year_of_birth(String year) 
	{
		birthyear.sendKeys(year);
	}
	

}
