package com.automation.selenium.utils;

import java.io.File;

public interface ApplicationConstants {
	
	//public static final String RESOURCES_PATH = System.getProperty("user.dir")+ File.separator+ "resources"+ File.separator ;
	public static final String RESOURCES_PATH = "C:\\Apr13_2019"+ File.separator+ "resources"+ File.separator ;
	
	public static final String DRIVERS_PATH = RESOURCES_PATH + "drivers" + File.separator;
	
	public static final String TESTDATA_PATH = RESOURCES_PATH + "testData" + File.separator;
	
	public static final String FILES_PATH = RESOURCES_PATH+ "files" + File.separator;
	
	public static final String SCREENS_PATH = RESOURCES_PATH + "screens" + File.separator;
	
	public static final String EXE_PATH = RESOURCES_PATH + "autoIt" + File.separator;
			
	public static final String CHROME_DRIVER_PATH = DRIVERS_PATH + "chromedriver.exe";

	public static final String FIREFOX_DRIVER_PATH = DRIVERS_PATH + "geckodriver.exe";
	
	public static final String IE_DRIVER_PATH= DRIVERS_PATH + "IEDriverServer.exe";
	
	public static final String testDataPathXls = TESTDATA_PATH + "ApplyPanOnline.xls";
	
	public static final String testDataPathXlsx = TESTDATA_PATH + "ApplyPanOnline.xlsx";
	
	public static final String inFilePath = FILES_PATH + "InFile.txt";
	
	public static final String outFilePath = FILES_PATH + "OutFile.txt";
	
	public static final String excelFilePath = TESTDATA_PATH + "TestData.xlsx";
	
	public static final String flatFilePath = TESTDATA_PATH + "TestData.txt";
	
	public static final String newtoursTestData = TESTDATA_PATH + "NewTours.xls";
	
	public static final String screensLocation = SCREENS_PATH;
	
	public static final String exeLocation = EXE_PATH;
	
	

}
