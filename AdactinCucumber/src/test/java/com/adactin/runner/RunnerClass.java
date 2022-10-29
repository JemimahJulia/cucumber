package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature", glue = "com.adactin.stepdefinition")

public class RunnerClass {
	
	public static WebDriver driver; //null
	
	@BeforeClass
	
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\AdactinCucumber\\Driver\\chromedriver.exe" );
		
		driver = new ChromeDriver();  //chrome
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	}
	
	
	@AfterClass
	
	public static void tearDown() {
		
		driver.close();
		
	}
	
	
	
	

	
	

}
