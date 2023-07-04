package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_script_DDT {
	public static String getData(String sh,int c,int r)
	{
		String value=null;
		try {
			FileInputStream fis = new FileInputStream("./ms/fetch.xlsx");
			Workbook book = WorkbookFactory.create(fis);	
			Sheet sheet = book.getSheet(sh);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			value=cell.toString();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return value;
	}
}
			

