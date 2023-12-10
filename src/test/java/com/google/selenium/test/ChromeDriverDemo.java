package com.google.selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
		
		String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.4eshopping.com/");
		driver.quit();

	
	}

}
