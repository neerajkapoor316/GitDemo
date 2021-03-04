package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstScript {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("https://artoftesting.com/sampleSiteForSelenium");
driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ISHAAN");
driver.findElement(By.xpath("//input[@id='male']")).click();
Select s1=new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));
s1.selectByVisibleText("Manual Testing");
s1.selectByIndex(3);//database testing
s1.selectByValue("Performance");

	}

}
