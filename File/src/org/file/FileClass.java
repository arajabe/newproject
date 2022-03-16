package org.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileClass {

	public static void main(String args[]) throws IOException  {
		File f = new File("C:\\Users\\VRKRISH\\eclipse-workspace\\File\\excel\\SAMPLE.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("CPCL SAL");
	int r = sheet.getPhysicalNumberOfRows();
	Row row = sheet.getRow(0);
	int c = row.getPhysicalNumberOfCells();
	for(int i=0;i<r;i++ ) {
		Row row2 = sheet.getRow(i);
		for(int j=0;j<c;j++) {
			
			System.out.println(row2.getCell(j));
		}
		
	}
	
	
	
	
	}

}
