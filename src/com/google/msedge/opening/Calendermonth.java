package com.google.msedge.opening;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Calendermonth {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement box = browser.findElement(By.id("datepicker"));
		
		//box.sendKeys("07/10/2022"+Keys.ENTER);
		
		box.click(); 
		
		WebElement next = browser.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		
		// a[@title='Next']
		
		next.click();
		
		WebElement date = browser.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a"));
		
		// a[contains(text(),'10')]
		
		date.click(); 
		
		
	}

}
