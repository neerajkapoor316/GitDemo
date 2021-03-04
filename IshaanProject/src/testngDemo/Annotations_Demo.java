package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations_Demo {
  @Test
  public void first() {
	  System.out.println("TEST1");
  }
  @Test
  public void sec() {
	  System.out.println("TEST2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aFTER METHOD");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before TEST");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" after TEST");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite ");
  }

}
