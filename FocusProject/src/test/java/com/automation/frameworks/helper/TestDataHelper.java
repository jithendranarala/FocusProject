package com.automation.frameworks.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;

import com.automation.frameworks.exceptions.FrameworkException;

public class TestDataHelper {
	
	private HSSFWorkbook workbook = null;
	private HSSFSheet sheet = null;
	
	public TestDataHelper(){
		try{
			workbook = new HSSFWorkbook(new FileInputStream(System.getProperty("user.dir") + File.separator+ "resources" + File.separator + "testData"	+ File.separator + "PoliceBazaar.xls"));
			sheet = workbook.getSheetAt(0);
		}catch(Exception exception){
			System.out.println(exception.getMessage());
		}
	}
	
	public TestDataHelper(String excelFile,String sheetName) {
		try {
			workbook = new HSSFWorkbook(new FileInputStream(excelFile));
			sheet = workbook.getSheet(sheetName);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	public int getNumberOfRows() {
		int totalRows = -1;
		try {
			totalRows = sheet.getPhysicalNumberOfRows();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return totalRows;
	}
	
	public int getColumnCount(int rowNumber) {
		int totalColumns = -1;
		try {
			totalColumns = sheet.getRow(rowNumber).getPhysicalNumberOfCells();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return totalColumns;
	}
	
	public HSSFRow getRow(int rowNumber) {
		HSSFRow row = null;
		try {
			row = sheet.getRow(rowNumber);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return row;
	}
	
	public String getCellData(int rowNumber, int colNumber) {
		Row row = null;
		Cell cellData = null;
		try {
			row = sheet.getRow(rowNumber);
			if (row != null) {
				cellData = row.getCell(colNumber);
				if (cellData != null) {
					if (cellData.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						return NumberToTextConverter.toText(cellData.getNumericCellValue());
					} else if (cellData.getCellType() == Cell.CELL_TYPE_STRING) {
						return cellData.getStringCellValue();
					} else {
						return cellData.toString().trim();
					}
				} else {
					return "";
				}
			} else {
				return "";
			}
		} catch (Exception exception) {
			new FrameworkException(exception);
			return null;
		}
	}

	
	public HashMap<String,String> getData(String testScriptName) {
		int rowCount;
		int requiredRowNumber = -1;
		int headerRow = -1;
		int columnCount = -1;
		String cellData;
		HashMap<String, String> hashMap = null;
		try {
			rowCount = getNumberOfRows();
			for (int index = 1; index < rowCount; index++) {
				cellData = sheet.getRow(index).getCell(0).toString();
				if (testScriptName.equals(cellData)) {
					
					requiredRowNumber = index;
					headerRow = requiredRowNumber-1;
					break;
				}
			}
			hashMap = new HashMap<String,String>();
			columnCount = sheet.getRow(headerRow).getPhysicalNumberOfCells();
			for(int index =0;index<columnCount;index++){
				hashMap.put(sheet.getRow(headerRow).getCell(index).toString(),sheet.getRow(requiredRowNumber).getCell(index).toString());	
			}

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return hashMap;

	}

}
