package DemoAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelData {
public static void main(String[]arg)throws EncryptedDocumentException, IOException {
	
	FileInputStream fis= new FileInputStream("C:\\Users\\chhs\\Documents\\Test_Cases\\Data.xlsx");

		Workbook book=WorkbookFactory.create(fis);
	
		DataFormatter df=new DataFormatter();
	
	Cell cl=book.getSheet("Data").getRow(1).getCell(0);
	String v= df.formatCellValue(cl);
	System.out.println(v);
	
	Cell cel2= book.getSheet("Data").getRow(4).getCell(4);
	String v2= df.formatCellValue(cel2);
	System.out.println(v2);
}
}
