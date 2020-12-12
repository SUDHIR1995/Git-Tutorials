package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class simple {

	public static void main(String[] args) throws Exception  {
		
		getcelldata();
		
//		getrowdata();
//		File src= new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
//		FileInputStream fis =new FileInputStream(src);
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		XSSFSheet sheet= wb.getSheetAt(0);
//		String value=sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value);
	}
	public static void getcelldata() throws EncryptedDocumentException, IOException {
		File src= new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
		FileInputStream file =new FileInputStream(src);
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rw=sh.getLastRowNum();
		System.out.println(rw);
	for (int i = 0; i <=rw; i++) {
			
			String cellvalue = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(cellvalue);
			
		}
		
		
		
	}
	public static void getrowdata() throws EncryptedDocumentException, IOException {
		File src= new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
		FileInputStream file =new FileInputStream(src);
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		short allcellvalue = sh.getRow(0).getLastCellNum();
		System.out.println(allcellvalue);
	for (int i = 0; i <=allcellvalue-1; i++) {
			
			String cellvalue = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(cellvalue);
			
		}
		
	}

}
