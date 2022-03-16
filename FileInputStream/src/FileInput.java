import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileInput {

public static void main(String args[]) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VRKRISH\\eclipse-workspace\\FileInputStream\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	File f= new File("C:\\Users\\VRKRISH\\eclipse-workspace\\FileInputStream\\FILE\\SAMPLE.xls");
FileInputStream fis = new FileInputStream(f);
Workbook w = new HSSFWorkbook(fis);
Sheet sheet= (Sheet) w.getSheet("sheet1");
sheet.get

}

}
