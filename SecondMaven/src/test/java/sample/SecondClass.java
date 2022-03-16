package sample;

import org.testng.annotations.Test;

public class SecondClass {

	@Test(groups="regression")
	private void test1() {

System.out.println("Second class regression");

	}
	
	@Test(groups="sanity")
	private void test2() {
		System.out.println("Print Second Class sanity");
	}

}
