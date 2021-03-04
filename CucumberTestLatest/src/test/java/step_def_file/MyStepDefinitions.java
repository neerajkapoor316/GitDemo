package step_def_file;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	WebDriver dr;
	@Given("^navigate to Gmail page$")
	public void navigate(){
		System.out.println("hello given");
	       }
	@When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
	public void login(String username,String password){
		System.out.println("hello when");
		System.out.println("Username-------"+username);
		System.out.println("Password-------"+password);
	       }
	@Then("^home page should be displayed$")
	public void verifySuccessful(){
		System.out.println("hello then");

	      }

@Then("^cards displayed are\"([^\"]*)\"$")
public void cards_displayed_are(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("VALUE IS ==="+arg1);
}
@Given("^user navigates to Facebook$")
public void user_navigates_to_Facebook() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
System.out.println("facebook given");}

@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("username diff==="+arg1);
	System.out.println("password diff==="+arg2);
}

@Then("^login should be unsuccessful$")
public void login_should_be_unsuccessful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
System.out.println("loginn");}

	}