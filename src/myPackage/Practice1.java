package myPackage;

import java.io.File;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

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
