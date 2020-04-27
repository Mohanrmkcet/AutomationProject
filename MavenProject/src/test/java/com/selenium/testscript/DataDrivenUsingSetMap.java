package com.selenium.testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenUsingSetMap {

		public static Map<String, String> excelRead() throws Throwable {
			File f = new File("C:\\Users\\Mohan\\eclipse-workspace\\MavenPractice\\library\\file1.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			XSSFSheet sheetAt = wb.getSheetAt(0);
			Map<String, String> mp = new HashMap<String, String>();
			for (int i = 1; i < sheetAt.getPhysicalNumberOfRows(); i++) {
				XSSFRow row = sheetAt.getRow(i);
				XSSFCell x = row.getCell(0);
				String userId = null;
				if (x.getCellType().equals(CellType.STRING)) {
					userId = x.getStringCellValue();
				} else if (x.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = x.getNumericCellValue();
					long l = (long) numericCellValue;
					userId = String.valueOf(l);
				}

				XSSFCell y = row.getCell(1);
				String userNam = null;
				if (y.getCellType().equals(CellType.STRING)) {
					userNam = y.getStringCellValue();
				} else if (y.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = y.getNumericCellValue();
					long l = (long) numericCellValue;
					userNam = String.valueOf(l);
				}

				XSSFCell z = row.getCell(2);
				String userPassword = null;
				if (z.getCellType().equals(CellType.STRING)) {
					userPassword = z.getStringCellValue();
				} else if (z.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = z.getNumericCellValue();
					long l = (long) numericCellValue;
					userPassword = String.valueOf(l);
				}
				mp.put(userId, userNam + "=" + userPassword);

			}

			return mp;

		}

		public static void main(String[] args) throws Throwable {
			Map<String, String> excelRead = excelRead();
			Set<Entry<String, String>> entrySet = excelRead.entrySet();
			for (Entry<String, String> x : entrySet) {
				String value = x.getValue();
				String[] split = value.split("=");
				System.out.println(
						"User Id is - " + x.getKey() + " User Name is - " + split[0] + " User PassWord is - " + split[1]);
			}
		}
	}



