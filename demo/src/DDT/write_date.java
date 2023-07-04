package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_date {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./ms/fetch.xlsx");
		Workbook book = WorkbookFactory.create(fis);	
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.createRow(5);
		Cell c = r.createCell(3);
		c.setCellValue("priya");
		FileOutputStream fos=new FileOutputStream("./ms/fetch.xlsx");
		book.write(fos);
	}

}
