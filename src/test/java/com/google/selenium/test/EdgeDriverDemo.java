package com.google.selenium.test;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverDemo {

	public static void main(String[] args) {

		//String edgepath = System.getProperty("user.dir")+"\\Resources\\edgedriver.exe";
		
		//System.setProperty("webdriver.edge.driver",edgepath);
		
		EdgeDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.4eshopping.com/");
		driver.quit();
	}

}
