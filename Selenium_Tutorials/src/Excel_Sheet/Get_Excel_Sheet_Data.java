package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Get_Excel_Sheet_Data{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
		
	
		
		
//		String cellvalue1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellvalue1);
		
		
//		OR
		
//		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
//		 Cell cellvalue = sh.getRow(0).getCell(0);
//
//		 if (cellvalue.getCellType()==CellType.STRING) {
//			System.out.println(cellvalue.getStringCellValue());
//				 
//		}
//		 else {
//			 System.out.println(cellvalue.getNumericCellValue());
//			 
//		 }
		 
		//OR print all data prescent in single row 
		
		
//		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		 
//		 for (int i = 0; i <=7; i++) {
//			 Cell cellvalue = sh.getRow(0).getCell(i);
//		 if (cellvalue.getCellType()==CellType.STRING) {
//			System.out.println(cellvalue.getStringCellValue());
//				 
//		}
//		 else {
//			 System.out.println(cellvalue.getNumericCellValue());
//			 
//		 }
//		}
		 
		
       
      	
	}

}