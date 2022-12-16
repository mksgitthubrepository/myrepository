package myPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet_reading 

{
    public static void main(String[] args) throws EncryptedDocumentException, IOException
  {
    
    	File myfile = new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Book1.xlsx");
    	
    	 Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
    	
    	
    	
        for(int i=0;i<=2;i++)
        {
        for(int j=0;j<=2;j++) 
        {
    	 
        	
        	String val = sheet.getRow(i).getCell(j).getStringCellValue();
        	
        	System.out.print(val+" ");
        }
        System.out.println();
        }
  }
	
}
