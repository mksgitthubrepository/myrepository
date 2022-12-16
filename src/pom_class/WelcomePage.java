package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	
	
	@FindBy(xpath="//button[@class='_2HpU8omQhEG7sYXwd0Eh1l _2FmruSwuk2JHO6-2xgtL2T _3Egbehba-00uZG8Je4wnMs _2tYKagf7d4LuxWKjM2VYRF _11TtDgZpGjVLJSAY07Hw8F _1S0nfo8cnHc9NA72DJm1QQ']") private WebElement accept;
	
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void accept() 
	{
		accept.click();
	}
	

}
