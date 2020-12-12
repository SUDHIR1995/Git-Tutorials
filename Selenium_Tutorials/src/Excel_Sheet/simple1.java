package Excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class simple1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		int value=WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
				
		
		for(int i=0;i<=value-1;i++) {
			short LastCellNum = WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getLastCellNum();
					
		for(int j = 0;j<LastCellNum-1;j++)
			{	
			
			Cell value2=WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(j);
			
					System.out.print(value2 +"                 ");
		}System.out.println();
		
		}
	}

}
