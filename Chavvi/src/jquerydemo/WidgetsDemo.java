package jquerydemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WidgetsDemo {

	public static void main(String[] args) {
WebDriver dr=new FirefoxDriver();
dr.get("https://jqueryui.com/");
dr.findElement(By.partialLinkText("Accordion")).click();
dr.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@class='demo-frame']")));
dr.findElement(By.xpath("//h3[@id='ui-id-3']")).click();


dr.switchTo().defaultContent();
	}

}
