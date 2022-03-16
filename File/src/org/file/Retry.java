package org.file;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
int min = 0; int max = 1;
	public boolean retry(ITestResult result) {
		System.out.println("outsied loop");
		if(min<max){
			min++;
			System.out.println("Inside loop");
			return true;
		}
			
		
		return false;
	
	}
	

}
