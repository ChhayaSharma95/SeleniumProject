package DemoAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRowCount {
	public static void main(String[]arg) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Temp1\\Book1.xlsx");

		Workbook book=WorkbookFactory.create(fis);
	
	DataFormatter df=new DataFormatter();
		
	Sheet sh=book.getSheet("Sheet1");
	int lastRow= sh.getLastRowNum();
	System.out.println(lastRow);
	
	int lastCell= sh.getRow(0).getLastCellNum();
	System.out.println(lastCell);
	
	for(int i=0;i<=lastRow;i++) {
		
		Row row=sh.getRow(i);
		
		for(int j=0;j<lastCell; j++) {
			
			Cell cel=row.getCell(j);
			String data=df.formatCellValue(cel);
			System.out.println(data);
		}
		System.out.println();
	}
	}
}
