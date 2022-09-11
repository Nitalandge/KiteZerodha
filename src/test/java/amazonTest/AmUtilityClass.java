package amazonTest;



import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AmUtilityClass {
	
	public static String getSheet(int rowindex,int colindex) throws Throwable   {
FileInputStream fis=new FileInputStream("D:\\amazon.xlsx");
 Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
 String data=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
 return data;
}
}