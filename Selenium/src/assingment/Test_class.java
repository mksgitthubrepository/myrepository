package assingment;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class {

	public static void main(String[] args) throws IOException, InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://collection.volvocars.com/en/accessories-6");
		driver.manage().window().maximize();

		driver.findElement(By.name("Private")).click();
		
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='product-grid']//div[@id='product-box'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='tool-link']//i[@class='icon-cart']")).click();
	}
}
