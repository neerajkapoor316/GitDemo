package seleniumglucode;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class test2 { 
	@Given("^user navigates to toolsqa.com$")
	
	public void navigatePage() {
	
System.out.println("given--");	
	}
	
	@When("^user logs in using Username as \"(.*)\" and Password \"(.*)\"$")
	
	public void login(String usename,String password) {
	
	System.out.println("Username is:"+ usename);
	
	System.out.println("Password is:"+ password);
	
	}
	
//	@When("^click the Submit button$")
//	
//	public void clickTheSubmitButton() {
//	
//System.out.println("when");	
//	}
	
//	@Then("^Home page should be displayed$")
//
//	public void validatePage() {
//
//System.out.println("home ");	
//	}
	
	@Then("^login should be successful$")

	public void validateLoginSuccess() {
	
System.out.println("then");
	}
	
	}
