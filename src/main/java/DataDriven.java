import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFSheet sheet = null;
		FileInputStream is = new FileInputStream("D:\\FromPC\\DiscD\\Java\\ExcelDataDriven\\ExcelDriven\\src\\main\\resources\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(is);
		
		int sheets = workbook.getNumberOfSheets();
		System.out.println("Number of sheets is: " +sheets);
		for(int i = 0; i<sheets; i++) {
			System.out.println("Sheet name is: " + workbook.getSheetName(i));
			if(workbook.getSheetName(i).equalsIgnoreCase("Profile")){
				sheet = workbook.getSheetAt(i);
			}			
		}
		Iterator<Row> rows = sheet.iterator();
		rows.next();
		rows.next();
		Row firstRow = rows.next();
		Iterator<Cell> cells =  firstRow.cellIterator();
		while(cells.hasNext()) {
			Cell value = cells.next();
			System.out.println(value.getStringCellValue());

		}
		
	}

}
