package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public static WebDriver driver =RunnerClass.driver; //RunnerClass driver
	
	

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
	    driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Jemimah444");
	  
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Cindrella@444");
	    
	}

	@Then("^user Click The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
	   
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		
		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s = new Select(location);
		s.selectByVisibleText("London");
		
	    
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		
		WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		
	    
	}

	@When("^user Select The Roomtype$")
	public void user_Select_The_Roomtype() throws Throwable {
		
		WebElement room_type = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select s2 = new Select(room_type);
		s2.selectByVisibleText("Double");
		
	    
	}

	@When("^user Select The NumberofRooms$")
	public void user_Select_The_NumberofRooms() throws Throwable {
		
		WebElement no_of_rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select s3 = new Select(no_of_rooms);
		s3.selectByVisibleText("2 - Two");
		
	    
	}

	@When("^user Select The Checkindate$")
	public void user_Select_The_Checkindate() throws Throwable {
		
		WebElement check_in_date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		check_in_date.sendKeys("29/09/2022");
		
		
	   
	}

	@When("^user Select The Checkoutdate$")
	public void user_Select_The_Checkoutdate() throws Throwable {
		
		WebElement check_out_date = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		check_out_date.sendKeys("30/09/2022");
		
		
	   
	}

	@When("^user Select The Adultsperroom$")
	public void user_Select_The_Adultsperroom() throws Throwable {
		
		WebElement adult_per_room= driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select s4 = new Select(adult_per_room);
		s4.selectByVisibleText("2 - Two");
		
	   
	}

	@When("^user Select The Childrenperrooms$")
	public void user_Select_The_Childrenperrooms() throws Throwable {
		
		WebElement child_per_room= driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		Select s5 = new Select(child_per_room);
		s5.selectByVisibleText("2 - Two");
		
	    
	}

	@Then("^user Click The Search Button$")
	public void user_Click_The_Search_Button() throws Throwable {
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
	   
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		
		WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
		select.click();
		
	}

	@Then("^user Click The Continue Button$")
	public void user_Click_The_Continue_Button() throws Throwable {
		
		WebElement next = driver.findElement(By.xpath("//input[@type='submit']"));
		next.click();
		
	 
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
		first_name.sendKeys("Jemimah");
		
	   
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		
		WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
		last_name.sendKeys("Julia");
		
	   
	}

	@When("^user Enter The Billingaddress In Address Field$")
	public void user_Enter_The_Billingaddress_In_Address_Field() throws Throwable {
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("chennai");
		
	
	  
	}

	@When("^user Enter The Creditcardnumber In Cardnumber Field$")
	public void user_Enter_The_Creditcardnumber_In_Cardnumber_Field() throws Throwable {
		
		WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
		credit.sendKeys("4444444444444444");
		
	   
	}

	@When("^user Enter The Creditcardtype In Cardtype Field$")
	public void user_Enter_The_Creditcardtype_In_Cardtype_Field() throws Throwable {
		
		WebElement card_type= driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6 = new Select(card_type);
		s6.selectByVisibleText("VISA");
		
	   
	}

	
	@When("^user Enter The Expirydate In Expirydate Field$")
	public void user_Enter_The_Expirymonth_In_Expirymonth_Field() throws Throwable {
		
		WebElement exp_month= driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7 = new Select(exp_month);
		s7.selectByVisibleText("December");
		
		WebElement exp_year= driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8 = new Select(exp_year);
		s8.selectByVisibleText("2022");
	}

	@When("^user Enter the Expiryyear In Expiryyear Field$")
	public void user_Enter_the_Expiryyear_In_Expiryyear_Field() throws Throwable {
		
		WebElement exp_year= driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8 = new Select(exp_year);
		s8.selectByVisibleText("2022");
		
	   
	}

	@When("^user Enter The Cvvnumber In Cvvfield$")
	public void user_Enter_The_Cvvnumber_In_Cvvfield() throws Throwable {
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("003");
		
		
	    
	}

	@Then("^user Click The Booknow Button$")
	public void user_Click_The_Booknow_Button() throws Throwable {
		
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
	   
	}

	@Then("^Click The Logout Button$")
	public void click_The_Logout_Button() throws Throwable {
		
		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		logout.click();
		
		
	 
	}


	
	
	

}
