package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	XSSFSheet sh;

	public ExcelDataProvider() {

		File src = new File("./TestData/DataBDD.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(src);
		} catch (Exception e) {

			System.out.println("The exception is:" + e.getMessage());
		}
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
	}

	/* To get the sheet index. Below is the example of method over loading as the
	 method names are same but arguments are different*/
	
//	public String getStringData(int sheetIndex, int row, int col) {
//		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
//	}

	// To read the sheet and String value from the cells
	public String getStringData(String sheetName, int row, int col) {

		wb.getSheetAt(0);
	return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	

	}

	// To read the sheet and numeric value from the cells
	public double getNumericData(String sheetName, int row, int col) {

		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}

}
