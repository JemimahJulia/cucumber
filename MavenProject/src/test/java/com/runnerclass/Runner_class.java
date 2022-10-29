package com.runnerclass;






import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_class {
	

	
		public static void main(String[] args)  throws InterruptedException, IOException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/"); 
			driver.manage().window().maximize(); 
			Thread.sleep(2000);
			
			//WebElement newreg = driver.findElement(By.xpath("//a[@href='Register.php']"));
			//newreg.click();
			
			WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
			username.sendKeys("Jemimah444");
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("Cindrella@444");
			
			WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
			login.click();
			
			WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
			Select s = new Select(location);
			s.selectByVisibleText("London");
			Thread.sleep(2000);
			
			WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
			Select s1 = new Select(hotel);
			s1.selectByVisibleText("Hotel Sunshine");
			Thread.sleep(2000);
			
			WebElement room_type = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
			Select s2 = new Select(room_type);
			s2.selectByVisibleText("Double");
			Thread.sleep(2000);
			
			WebElement no_of_rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
			Select s3 = new Select(no_of_rooms);
			s3.selectByVisibleText("2 - Two");
			Thread.sleep(2000);
			
			WebElement check_in_date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
			check_in_date.sendKeys("29/09/2022");
			Thread.sleep(2000);
			
			WebElement check_out_date = driver.findElement(By.xpath("//input[@name='datepick_out']"));
			check_out_date.sendKeys("30/09/2022");
			Thread.sleep(2000);
			
			WebElement adult_per_room= driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
			Select s4 = new Select(adult_per_room);
			s4.selectByVisibleText("2 - Two");
			Thread.sleep(2000);
			
			WebElement child_per_room= driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
			Select s5 = new Select(child_per_room);
			s5.selectByVisibleText("2 - Two");
			Thread.sleep(2000);
			
			WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			
			WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
			select.click();
			Thread.sleep(2000);
			
			WebElement next = driver.findElement(By.xpath("//input[@type='submit']"));
			next.click();
			Thread.sleep(2000);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
			first_name.sendKeys("Jemimah");
			Thread.sleep(2000);
			
			WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
			last_name.sendKeys("Julia");
			Thread.sleep(2000);
			
			WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
			address.sendKeys("chennai");
			Thread.sleep(2000);
			
			WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
			credit.sendKeys("4444444444444444");
			Thread.sleep(2000);
			
			WebElement card_type= driver.findElement(By.xpath("//select[@name='cc_type']"));
			Select s6 = new Select(card_type);
			s6.selectByVisibleText("VISA");
			Thread.sleep(2000);
			
			WebElement exp_month= driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
			Select s7 = new Select(exp_month);
			s7.selectByVisibleText("December");
			Thread.sleep(2000);
			
			WebElement exp_year= driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
			Select s8 = new Select(exp_year);
			s8.selectByVisibleText("2022");
			Thread.sleep(2000);
			
			WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
			cvv.sendKeys("003");
			Thread.sleep(2000);
			
			WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
			book.click();
			JavascriptExecutor js1=(JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			
			WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
			logout.click();
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\Screenshots//hotelconfirmation.png");
			
			FileUtils.copyFile(source, target);
			
			
			
			
			
			
			
			
			
		}

	}



