package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomerSteps {
	
	static WebDriver driver;

@Given("Launches telecom application")
public void launches_telecom_application() {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\prince\\eclipse-workspace\\cucumberSample\\driver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://demo.guru99.com/telecom/");
}

@Given("Navigate into add customer page")
public void navigate_into_add_customer_page() {
	
    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1])")).click();
}

@When("Entering all the fields")
public void entering_all_the_fields() {
	
    driver.findElement(By.xpath("//label[@for='done'])[1]")).click();
    driver.findElement(By.id("fname")).sendKeys("prince");
    driver.findElement(By.id("lname")).sendKeys("parody");
    driver.findElement(By.id("email")).sendKeys("princeparody13@gmail.com");
    driver.findElement(By.name("addr")).sendKeys("Tiruvallur");
    driver.findElement(By.id("telephoneno")).sendKeys("9003863103");
}

@When("Clicking submit button")
public void clicking_submit_button() {
    
	driver.findElement(By.xpath("(//input[@type='submit'])[1])")).click();
}

@Then("Generated customer id is diaplayed")
public void generated_customer_id_is_diaplayed() {
	
    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
}




}
