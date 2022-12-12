package myPackage;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions 
{
    public static void main(String[] args) 
    
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		
	    ChromeOptions options= new ChromeOptions();
	   //options.addArguments("incognito");
	    options.addArguments("--disable-notifications");
	   //options.addArguments("start-maximized");
	    options.addArguments("--disable-infobars");
	    options.setAcceptInsecureCerts(true);
	     //options.setHeadless(true);   --> headless
	    //options.addArguments("headless");
	    options.setImplicitWaitTimeout(Duration.ofSeconds(5));
	   //options.setCapability("proxy", "proxyvalue");
	   //options.addExtensions("path of downloaded extention file");
	    
	   options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});//-->to disable infobars  
	   options.setExperimentalOption("excludeSwitches",new String[]{"disable-popup-blocking"});
		WebDriver driver= new ChromeDriver(options);
		
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
	/*	driver.get("https://www.justdial.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);*/
		
	
	}
}
