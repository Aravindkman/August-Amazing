package com.google.msedge.opening;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> element = browser.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		WebElement fromelement = element.get(6);
		WebElement toelement = element.get(0);
		
		Actions action = new Actions(browser);
		
		action.clickAndHold(fromelement);
		action.moveToElement(toelement);
		action.release();
		action.build().perform();
		
		
		
		
		
		
		
	}

}
