package com.selenium.testscript;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDrivenOutputAsTable {

		public static void main(String[] args) throws Throwable {
			File f = new File("C:\\Users\\Mohan\\eclipse-workspace\\MavenPractice\\library\\file1.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
				XSSFRow row = sheetAt.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					XSSFCell cell = row.getCell(j);
					String stringCellValue = null;
					if (cell.getCellType().equals(CellType.STRING)) {
						stringCellValue = cell.getStringCellValue();
					} else if (cell.getCellType().equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						stringCellValue = String.valueOf(l);
					}
					System.out.print(stringCellValue + " | ");
				}
				System.out.println();
			}

		}

	

	
}
