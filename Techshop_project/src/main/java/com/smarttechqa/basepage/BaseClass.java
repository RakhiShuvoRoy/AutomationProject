package com.smarttechqa.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smarttechqa.com/");
		
	}
	
     public static void main(String[] args) {
    	 BaseClass.setUp();
    	 
	}
	
	
	
}
