package org.file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestClass {

	@Test
	@Parameters(value="a")
	private void test1(int a) {
		System.out.println(a);

	}
	@Test(dataProvider="data")
	private void test2(String a, String b) {
	System.out.println("teset1"+a+"   "+b);

	}
	@Test
	private void test3() {
		Assert.assertFalse(true);
		System.out.println("Test0");

	}
	@DataProvider(name="data")
	private Object[][] data1() {
		return new Object[][] {
			
			{"10","12"}
		};
		

	}
	

}
