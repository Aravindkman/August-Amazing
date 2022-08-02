package com.google.msedge.opening;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AK\\Documents\\Selinium web driver\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();

		browser.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement firstdropdown = browser.findElement(By.id("dropdown1"));

		Select pick1 = new Select(firstdropdown);

		pick1.selectByIndex(4);

		pick1.selectByVisibleText("Appium");

		pick1.selectByValue("1");
		
		List<WebElement> listofoptions = pick1.getOptions();
		
		int count= listofoptions.size();
		
		System.out.println("Number of options"+count);
 
		// WebElement Seconddropdown = browser.findElement(By.id("dropdown2"));

		// Select pick2 = new Select(Seconddropdown);

		// pick2.selectByVisibleText("Appium");

		// WebElement Thirddropdown = browser.findElement(By.id("dropdown3"));

		// Select pick3 = new Select(Thirddropdown);

		// pick3.selectByValue("4");
		
		firstdropdown.sendKeys("Loadrunner");
		
		WebElement multiselect = browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multi= new Select(multiselect);
		
		multi.selectByValue("1");
		multi.selectByValue("2");
		
		
	}
}
