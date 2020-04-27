package com.selenium.testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenBaseclass {
	
		public static void excelWrite(int rownum, int cellnum, String value) throws Throwable {
			File f = new File("C:\\Users\\Mohan\\eclipse-workspace\\MavenPractice\\library\\file1.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			XSSFRow row = sheetAt.getRow(rownum);
			if (row==null) {
				System.out.println("Creating new row");
				row = sheetAt.createRow(rownum);
			}
			XSSFCell cell = row.getCell(cellnum);
			if (cell==null) {
				System.out.println("Creating new cell");
				cell = row.createCell(cellnum);
			}
			cell.setCellValue(value);
			
			FileOutputStream fout = new FileOutputStream(f);
			wb.write(fout);
			wb.close();
			System.out.println("Completed");
		}

		public static String excelRead(int rownum, int cellnum) throws Throwable {
			File f = new File("C:\\Users\\Mohan\\eclipse-workspace\\MavenPractice\\library\\file1.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			XSSFRow row = sheetAt.getRow(rownum);
			XSSFCell cell = row.getCell(cellnum);
			String cellValue= null;
			if (cell.getCellType().equals(CellType.STRING)) {
				cellValue = cell.getStringCellValue();
			}else if (cell.getCellType().equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				cellValue = String.valueOf(l);
			}
			return cellValue;
		}
		public static void main(String[] args) throws Throwable {}

	}



