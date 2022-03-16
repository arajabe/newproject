package org.file;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AutoRetry implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer r = a.getRetryAnalyzer();
		System.out.println("Retry Transform outside");
		if(r==null){
			System.out.println("Retry Transform inside");
			a.setRetryAnalyzer(Retry.class);
		}
		
	}

	

}
