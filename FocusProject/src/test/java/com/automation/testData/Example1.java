package com.automation.testData;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to read data from xls file */
public class Example1 {

	@Test
	public void readTestData() {
		int numberOfRows;
		int numberOfColumns;
		HSSFWorkbook workBook = null;
		HSSFSheet sheet = null;
		HSSFRow row = null;
		try {
			workBook = new HSSFWorkbook(new FileInputStream(ApplicationConstants.testDataPathXls));
			sheet = workBook.getSheet("PanOnline");
			numberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println("NumberOfRows:" + numberOfRows);
			for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
				row = sheet.getRow(rowIndex);
				numberOfColumns = row.getPhysicalNumberOfCells();
				System.out.println("NumberOfColumns:" + numberOfColumns);
				for (int column = 0; column < numberOfColumns; column++) {
					System.out.print(row.getCell(column).toString() + "\t");
				}
				System.out.println();
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				workBook.close();
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}

		}

	}
}
