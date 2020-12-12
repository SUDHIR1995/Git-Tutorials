package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAllValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\xyz.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
		int LastRowNum = sh.getLastRowNum();
		System.out.println("LastRowNum value is::"+LastRowNum);
		for (int i = 0; i <=LastRowNum; i++) {
			int LastCellNum = sh.getRow(i).getLastCellNum();
			
			for (int j = 0; j <=LastCellNum-1; j++) {
				
				Cell ctype = sh.getRow(i).getCell(j);
				
				if (ctype.getCellType()==CellType.STRING) {
					
					System.out.print(ctype+"  ");
				}
				else {
					System.out.print(ctype+"  ");
				}
				
			}
			System.out.println();
		}

	}

}
