package org.maventest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenSample {

	public static void main(String args[]) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
		File f = new File("C:\\Users\\VRKRISH\\eclipse-workspace\\MavenNewProject\\excel\\SAMPLE.xlsx");
	FileInputStream fis = new FileInputStream(f); 
	Workbook w = new XSSFWorkbook(fis);
	Sheet sheet=w.getSheet("CPCL SAL");
	int rownumber =sheet.getPhysicalNumberOfRows();
	Row row=sheet.getRow(1);
	int cellnumbers=row.getPhysicalNumberOfCells();
	
	}

}
