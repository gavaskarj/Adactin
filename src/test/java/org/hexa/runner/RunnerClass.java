package org.hexa.runner;

import org.hexa.base.LibGlobal;
import org.hexa.pages.LoginPage;

public class RunnerClass extends LibGlobal{

	
	public static void main(String[] args) {
		
		LibGlobal l = new LibGlobal(); 
		l.launchBrowser();
		l.maximize();
		l.loadUrl("https://adactinhotelapp.com/index.php");
		
		LoginPage page = new LoginPage(); 
		page.TC1("gavaskarjp", "Gowtham@123");
	
		
		
		//GIT --> Store  2 
		
		
	}
}
