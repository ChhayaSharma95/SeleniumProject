package Section2DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataUtils {
	public String fatchDataFromProperty(String key) throws IOException{
		FileInputStream fis= new FileInputStream("./DataStorage/PropertiesFile.properties");
		Properties pob=new Properties();
		pob.load(fis);
		
		String value= pob.getProperty(key);
		return value;
}

	public String fetchDataFromExcel(String sheetname, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("./DataStorage/TestCaseData.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		Cell cl= book.getSheet(sheetname).getRow(rowNum).getCell(cellNum);
		 DataFormatter df=new DataFormatter();
		 String value=df.formatCellValue(cl);
		
		return value;
	}
}