package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_Row_Excel_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
		
		CellType cellvalue = sh.getRow(0).getCell(0).getCellType();
		
		System.out.println(cellvalue);
		
	}

}
