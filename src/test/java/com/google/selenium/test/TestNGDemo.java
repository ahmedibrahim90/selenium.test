package com.google.selenium.test;

import static org.testng.Assert.fail;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

//	ChromeDriver driver;
//	//EdgeDriver driver;
//
//	@BeforeTest(groups = {"Regression"})
//	public void OpenURL() 
//	{
//		String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver",chromepath);
//
//		driver = new ChromeDriver();
//		//driver = new EdgeDriver();
//		driver.navigate().to("https://www.4eshopping.com");
//		driver.manage().window().maximize();
//
//	}
//
//	@Test(priority = 1, groups = {"Regression"})
//	public void userCanLogin()
//	{
//		System.out.println(driver.getCurrentUrl());
//	}
//
//	@Test(priority = 2)
//	public void userAddItemToCart()
//	{
//		System.out.println(driver.getTitle());
//		fail("throw exception");
//	}
//	
//	@Test(priority = 3, dependsOnMethods = {"userAddItemToCart"})
//	public void dependOn()
//	{
//		System.out.println("dependsoNMethod");
//	}
//	
//	@Test(priority = 4, enabled = false)
//	public void disableMehtod()
//	{
//		System.out.println("Disbale this methos");
//	}
//	
//	
//
//	@AfterTest(groups = {"Regression"})
//	public void closeURL()
//	{
//		driver.quit();
//	}
	
	ChromeDriver driver;
	
	
	@BeforeTest(groups = {"regression"})
	public void openURL()
	{
		String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		driver = new ChromeDriver();
		driver.navigate().to("https://www.4eshopping.com/");
		String ExpectedTitle = driver.getTitle();
		String ActualTitle = "4e shopping | 4e shopping";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	@Test(priority = 0, alwaysRun = true, groups = {"regression"})
	public void getCurrentURL()
	{
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@Test(priority = 1, dependsOnMethods = {"getCurrentURL"}, groups = {"regression"})
	public void getTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 2, enabled = true, groups = {"live"})
	public void gdisba()
	{
		System.out.println(driver.getTitle());
	}
	
	@AfterTest(groups = {"regression"})
	public void closeURL()
	{
		driver.quit();
	}

}
