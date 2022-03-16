package firsttest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		int min = 0;
		int max = 100;
		if(min > max)
		{
			min++;
			return true;
		
		}
		return false;
	}
	


}
