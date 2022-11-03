package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	// use HSSFWorkbook for .xls files
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			
			// InputStream = new FileInputStream(excelPath);
			// workbook = new HSSFWorkbook(new POIFSFileSystem(file));
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void getCellData(int rowNum, int colNum) throws IOException {
//		String valueAtCell0 = sheet.getRow(1).getCell(0).getStringCellValue();
//		int valueAtCell2 = (int) sheet.getRow(1).getCell(2).getNumericCellValue();
		//works for all kinds of data
		DataFormatter formatter = new DataFormatter();
		Object valueAtCell = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(valueAtCell);
	}
	
	public static void getRowCount() {
//		String projDir = System.getProperty("user.dir");
//		System.out.println(projDir);
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Num of rows: " + rowCount);
	}
}
