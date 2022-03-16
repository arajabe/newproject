package org.lang;

import org.lang.LanguageDetails.StateDetails;

public class LanguageInfo extends StateDetails {

	public void tamilLanguage() {
		// TODO Auto-generated constructor stub 
		System.out.println("tamilLanguage");
	}
	public void englishLanguage() {
		System.out.println("englishLanguage");
		
	}
	public void hindiLanguage() {
		System.out.println("hindiLanguage()");
	}
public static void main (String args[]) {
	
	LanguageInfo a = new LanguageInfo();
	a.tamilLanguage();
	a.englishLanguage();
	a.hindiLanguage();
	a.southIndia();
	a.northIndia();
	
	
	
}
	
}
