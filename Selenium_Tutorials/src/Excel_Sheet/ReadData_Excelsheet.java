package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_Excelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
	
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		Row row = sh.getRow(0);
		short lastcellnum = row.getLastCellNum();
		System.out.println(row);
		for (int i = 0; i <=lastcellnum; i++) {
			
			Sheet sh1 = WorkbookFactory.create(file).getSheet("Sheet1");
			
			 Cell cellvalue = sh1.getRow(i).getCell(0);
		
			 if (cellvalue.getCellType()==CellType.STRING) {
				System.out.println(cellvalue.getStringCellValue());
				
				 
			}
			 else {
				 System.out.println(cellvalue.getNumericCellValue());
				 
			 }
		}
		
		
		
		
		
		
//	
//			 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
//				
//				 Cell cellvalue = sh.getRow(i).getCell(j);
//			
//				 if (cellvalue.getCellType()==CellType.STRING) {
//					System.out.println(cellvalue.getStringCellValue());
//					
//					 
//				}
//				 else {
//					 System.out.println(cellvalue.getNumericCellValue());
//					 
//				 }
//				
			
		
		
		
		
//		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getNumericCellValue();
//		System.out.println(value);

		
		
		
		
//		String cellvalue1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellvalue1);
		
//		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
//		
//		 Cell cellvalue = sh.getRow(0).getCell(2);
//	
//		 if (cellvalue.getCellType()==CellType.STRING) {
//			System.out.println(cellvalue.getStringCellValue());
//			
//			 
//		}
//		 else {
//			 System.out.println(cellvalue.getNumericCellValue());
//			 
//		 }
//		
		
		
		
	}

}
