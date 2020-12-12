package Basic_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetRowData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\Worksheet01.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int LastRowNum = sh.getLastRowNum();
		
		//LastRowNum no=4
		//row 
		
		for (int i = 0; i <=LastRowNum; i++) {
			short LastCellNum = sh.getRow(i).getLastCellNum();
			//cell
			for (int j = 0; j <=LastCellNum-1; j++) {
				
			
		
			
			Cell cellvalue = sh.getRow(i).getCell(j);
		
			System.out.println(cellvalue);
		
		}
		
		
	
	
	}
	

	}}
