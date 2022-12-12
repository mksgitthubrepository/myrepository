package myPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice1 
{
    public static void main(String[] args) throws InterruptedException, IOException 
    
    {
    
    File f=new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Book2.xlsx");
    
    
    Sheet sheet = WorkbookFactory.create(f).getSheet("Sheet1");
	
    int lastrowno = sheet.getLastRowNum();

    System.out.println(lastrowno);     
 
 int lastcellno = sheet.getRow(0).getLastCellNum()-1;    
    
    System.out.println(lastcellno);
    
	}
}
