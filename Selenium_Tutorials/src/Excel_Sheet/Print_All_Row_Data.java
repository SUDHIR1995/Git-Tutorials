package Excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Print_All_Row_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

		FileInputStream file=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\xyz.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		for (int i = 0; i <=2; i++) {
			Cell cellValue=	sh.getRow(0).getCell(i);
			
		if(cellValue.getCellType()==CellType.STRING) {
		String value=sh.getRow(0).getCell(i).getStringCellValue();
		
		System.out.println(value+" ");
		
		}
		else{
			double value=sh.getRow(0).getCell(i).getNumericCellValue();
			
			System.out.println(value+" ");
			
		}

	}
	}
	
	
}
