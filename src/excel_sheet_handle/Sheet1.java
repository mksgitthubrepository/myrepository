package excel_sheet_handle;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sheet1 
{
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File sheet =new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Exsheet.xlsx");
		
		
		Sheet s = WorkbookFactory.create(sheet).getSheet("Sheet2");
		
		
		int lastrow = s.getLastRowNum();
		System.out.println(lastrow);
		
		 int lastcell = s.getRow(lastrow).getLastCellNum()-1;
		System.out.println(lastcell);
		
		
		
	     for(int i=0;i<=lastrow;i++) 
	     {
	    	 for(int j=0;j<=lastcell;j++) 
	    	 {
	    		 
	    		 CellType data = s.getRow(i).getCell(j).getCellType();
	    		
	    		if(data==CellType.STRING) 
	    		{
	    			String string = s.getRow(i).getCell(j).getStringCellValue();
	    			System.out.print(string+" ");
	    		}
	    		 
	    		else if(data==CellType.NUMERIC)
	    		{
	    			double num = s.getRow(i).getCell(j).getNumericCellValue();
	    			System.out.print(num+" ");
	    		}
	    		
	    		else if(data==CellType.BOOLEAN) 
	    		{
	    			boolean bol = s.getRow(i).getCell(j).getBooleanCellValue();
	    			System.out.print(bol+" ");
	    		}
	    		
	    		else if(data==CellType.BLANK) 
	    		{
	    			System.out.println();
	    		}
	    	 }
	    	 System.out.println();
	    	
	     }
	}

}
