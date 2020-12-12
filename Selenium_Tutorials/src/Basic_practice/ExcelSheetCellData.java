package Basic_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelSheetCellData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream file=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\Worksheet01.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		short getLastCellNum = sh.getRow(0).getLastCellNum();
		
		System.out.println(getLastCellNum);
	
		for (int i = 0; i <=getLastCellNum-1; i++) {
			
			Cell cellvalue = sh.getRow(1).getCell(i);
			
			
			System.out.println(cellvalue);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			if (cellvalue.getCellType()==CellType.STRING) {
//				System.out.println(cellvalue);
//			}
//
//			else {
//				System.out.println(cellvalue);
//			}
		}
		

	}

}

