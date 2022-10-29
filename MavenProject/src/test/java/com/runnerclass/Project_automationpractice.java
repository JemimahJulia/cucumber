package com.runnerclass;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_automationpractice {
	
	public static void main(String[] args)  throws InterruptedException,IOException{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php"); 
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
			
			Actions ac = new Actions (driver);
			ac.moveToElement(women).build().perform();
			
			WebElement casual_dress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
			casual_dress.click();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		    WebElement image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		    ac.moveToElement(image).build().perform();
		    
		    WebElement add_to_cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
			add_to_cart.click();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			checkout.click();
			
	     	JavascriptExecutor js1=(JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,500)");
			
			WebElement quantity = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
			quantity.clear();
	     	quantity.sendKeys("6");
			
			WebElement proceed_to_checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			proceed_to_checkout.click();
			
			JavascriptExecutor js2=(JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,500)");
			
			//WebElement sign_in = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[1]"));
			//sign_in.sendKeys("jemijob95@gmail.com");
			
			 //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 
			 //WebElement create_account = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			 //create_account.click();
			
			WebElement email = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
			email.sendKeys("jemijob95@gmail.com");
			
			WebElement pwd = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
			pwd.sendKeys("Cindrella@444");
			
			WebElement signin = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
			 signin.click();
			
			
			 
			 //WebElement title = driver.findElement(By.xpath("(//div[@class='radio'])[2]"));
			 //title.click();
			 
			 //WebElement first_name = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[1]"));
			 //first_name.sendKeys("Jemimah");
			 
			 //WebElement last_name = driver.findElement(By.xpath("(//input[@data-validate='isName'])[2]"));
			 //last_name.sendKeys("Julia");
			 
			 //WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			 //password.sendKeys("Cindrella@444");
			 
			 //WebElement day = driver.findElement(By.id("days"));
				//Select s = new Select(day);
				//s.selectByValue("30");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement month = driver.findElement(By.id("months"));
				//Select s1 = new Select(month);
				//s1.selectByValue("1");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
				//WebElement year = driver.findElement(By.id("years"));
				//Select s2 = new Select(year);
				//s2.selectByValue("1995");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//driver.findElement(By.id("newsletter")).click();
				//driver.findElement(By.id("optin")).click();
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
				//address.sendKeys("3893 Eastland Avenue");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
				//city.sendKeys("Jackson");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
				//Select s3 = new Select(state);
				//s3.selectByValue("24");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement zipcode = driver.findElement(By.id("postcode"));
				//zipcode.sendKeys("39201");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
				//Select s4 = new Select(country);
				//s4.selectByValue("21");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement phone_number = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
				//phone_number.sendKeys("601-416-3523");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement alias = driver.findElement(By.xpath("//input[@name='alias']"));
				//alias.sendKeys("Home");
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
				//register.click();
				
				WebElement proceedcheckout = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
				proceedcheckout.click();
				
				WebElement terms = driver.findElement(By.id("uniform-cgv"));
				terms.click();
				
				
				WebElement out = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				out.click();
				
				WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
				pay.click();
				
				WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
				confirm.click();
				
				JavascriptExecutor js3=(JavascriptExecutor) driver;
				js3.executeScript("window.scrollBy(0,250)");
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File target = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\Screenshots//atomation.png");
				
				FileUtils.copyFile(source, target);
				
				
				
				
				
				
				
				
				
				
		
	}
		
	}
				
			
				
			
				
				
				
				
				
				
		
				
			
			
			
			
			
			
			
			
			
			
			
			




