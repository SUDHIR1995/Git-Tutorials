package Excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetRowData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
		int rowvalue = sh.getLastRowNum();
		System.out.println(rowvalue);
		
		for (int i = 0; i <=rowvalue; i++) {
			Cell ctype = sh.getRow(i).getCell(0);
			 if (ctype.getCellType()==CellType.STRING) {
					System.out.println(ctype.getStringCellValue());
					 
				}
				 else {
					 System.out.println(ctype.getNumericCellValue());
					 
				 }
		}

	}

}
