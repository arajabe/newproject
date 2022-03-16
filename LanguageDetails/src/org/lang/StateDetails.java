package org.lang;

public class StateDetails {

	private void southIndia() {
		System.out.println("southIndia");
	}
	private void northIndia() {
		System.out.println("northIndia");		
	}

	public static void main(String args[]) {
		
		StateDetails c = new StateDetails();
		c.southIndia();
		c.northIndia();
		LanguageInfo e = new LanguageInfo();
		e.tamilLanguage();
		e.englishLanguage();
		e.hindiLanguage();
		
	}
}

