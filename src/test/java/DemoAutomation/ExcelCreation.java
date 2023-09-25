package DemoAutomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelCreation {
	public static void main(String[]arg) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\chhs\\Documents\\Test_Cases\\DataDrivenTesting.xlsx");

		Workbook book=WorkbookFactory.create(fis);
		book.createSheet("MyShaeet").createRow(2).createCell(2).setCellValue("Hello");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\chhs\\Documents\\Test_Cases\\DataDrivenTesting.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("pass");
		
	}	
}
