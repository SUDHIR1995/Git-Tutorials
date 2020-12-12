package Excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file =new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\ExcelWorksheet.xlsx");
		
		
		int no_of_row = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(no_of_row);
		
		for (int i = 0; i <=no_of_row; i++) {
			FileInputStream file1 =new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\ExcelWorksheet.xlsx");
			Sheet sheet = WorkbookFactory.create(file1).getSheet("Sheet1");
			
		}
		
		
	}

}
