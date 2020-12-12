package Excel_Sheet;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excel_1 {

	public static void main(String[] args) throws Exception  {
		
		FileInputStream file =new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
		short value=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println("row lenght is"+"   "+value);
		
	for(int i=0;i<value;i++) {
		
	
		FileInputStream file1 =new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");
		String value1=WorkbookFactory.create(file1).getSheet("sheet1").getRow(3).getCell(i).getStringCellValue();
	
		System.out.println(value1);
		
		
	}System.out.print(" ");
		
		
		
	}

}
