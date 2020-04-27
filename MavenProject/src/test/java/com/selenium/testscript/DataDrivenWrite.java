package com.selenium.testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDrivenWrite {

		public static void main(String[] args) throws Throwable {
			File f = new File("C:\\Users\\Mohan\\eclipse-workspace\\MavenPractice\\library\\file1.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			XSSFRow row = sheetAt.getRow(2);
			if (row==null) {
				System.out.println("Creating new row");
				row = sheetAt.createRow(2);
			}
			XSSFCell cell = row.getCell(6);
			if (cell==null) {
				System.out.println("Creating new cell");
				cell = row.createCell(6);
			}
			cell.setCellValue("Hello");
			
			FileOutputStream fout = new FileOutputStream(f);
			wb.write(fout);
			wb.close();
			System.out.println("Completed");
		}

	}



	

