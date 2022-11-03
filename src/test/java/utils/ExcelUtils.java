package utils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static void main(String[] args) {
		getRowCount();
	}
	
	public static void getRowCount() {
		
//		String projDir = System.getProperty("user.dir");
//		System.out.println(projDir);
		
		String excelPath = "./data/TestData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook();
	}
}
