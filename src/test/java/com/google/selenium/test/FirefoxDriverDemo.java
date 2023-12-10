package com.google.selenium.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {

		//String firefoxpath = System.getProperty("user.dir")+"\\Resources\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver",firefoxpath);
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.4eshopping.com/");
		driver.quit();
	}

}
