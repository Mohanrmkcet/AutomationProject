package com.selenium.testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDriven {
	public static void main(String[] args) throws Throwable {
		//Step 1: Choose the file
		File f= new File("C:\\Users\\Hasee\\eclipse-workspace\\MavenProject\\Drivers\\ExcelPractise.xlsx");
		
		//Get inputstream
		FileInputStream fin=new FileInputStream(f);
		
		//Choose the workbook - .xlsx(2007<) - XSSFworkbook and .xls(2007> HSSFworkbook)
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		
		//Select sheet
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		//select row
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i=0;i<physicalNumberOfRows; i++) {
			XSSFRow row=sheet.getRow(i);
			
			//select cell
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<physicalNumberOfCells; j++) {
				XSSFCell cell=row.getCell(j);
				
				//get celltype
				String cellValue = null;
				CellType cellType = cell.getCellType();
				if(cellType.equals(CellType.STRING)) {
					cellValue=cell.getStringCellValue();
				}else if(cellType.equals(CellType.NUMERIC)) {
					double numericCellValue=cell.getNumericCellValue();
					long l=(long) numericCellValue;
					cellValue=String.valueOf(l);
				}
				System.out.println(cellValue);
				
				
				
			}
		}
		
	}
}
