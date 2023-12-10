package com.google.selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionDemo {

	ChromeDriver driver;
	

	@BeforeTest
	public void OpenURL() 
	{
		//String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver",chromepath);
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		driver.navigate().to("https://www.4eshopping.com");
		driver.manage().window().maximize();

	}

	@Test
	public void getTile()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "4e shopping | 4e shopping");
	}

	
	
	

	@AfterTest
	public void closeURL()
	{
		driver.quit();
	}

}
