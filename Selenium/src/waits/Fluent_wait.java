package waits;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fluent_wait 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File sheet =new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Exsheet.xlsx");
		
		
		Sheet s = WorkbookFactory.create(sheet).getSheet("Sheet1");
		
		
		
		String row = s.getRow(0).getCell(0).getStringCellValue();
		
		
		System.out.println(row);
	}

}
