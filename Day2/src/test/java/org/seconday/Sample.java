package org.seconday;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
@Test(dataProvider ="sample")

private void test1(String a,String b) {
	
		System.out.println("Test :"+a);
}
@Test
private void test2() {
	System.out.println("Seconday Day Regression");

}
@Test
private void test3() {
	System.out.println("Seconday Day sanity");

}
@DataProvider(name="sample")
private Object[][] getData(){
	return new Object[][] {
		{"1","2"},
		{"3","4"},
		};
	
}

}
