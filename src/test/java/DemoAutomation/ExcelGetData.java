package DemoAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelGetData {
	public static void main(String[]arg) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis=new FileInputStream("C:\\Users\\chhs\\Documents\\Test_Cases\\DataDrivenTesting.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sh=book.getSheet("Data1");
		
		Row rw=sh.getRow(2);
		
		Cell cl=rw.getCell(1);
		
		String value= book.getSheet("Data1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(value);
	}
}
