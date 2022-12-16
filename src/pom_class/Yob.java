package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yob 
{

	@FindBy(name="yob") private WebElement yob;
	
	
	public Yob(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void yearofbirth() 
	{
		yob.sendKeys("1998");
	}

}
