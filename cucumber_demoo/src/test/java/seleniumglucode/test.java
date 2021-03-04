package seleniumglucode;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class test { 
	   WebDriver driver = null; 
		
	   @Given("^I have open the browser$") 
	   public void openBrowser() { 
	      //driver = new FirefoxDriver(); 
	    System.setProperty("webdriver.chrome.driver","D:\\Libraries\\Selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
	   } 
		
	   @When("^I open Google website$") 
	   public void goToFacebook() { 
	      driver.navigate().to("https://www.google.com/?gws_rd=ssl"); 
	   } 
		
	   @Then("^Google button should exists$") 
	   public void loginButton() { 
	      if(driver.findElement(By.xpath("//input[@name='btnK']")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	   //   driver.close(); 
	   } 
	}