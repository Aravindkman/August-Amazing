package com.google.msedge.opening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> tag = browser.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		int siz = tag.size();
		
		System.out.println(siz);
		
		Actions act = new Actions(browser);
		
		act.keyDown(Keys.CONTROL)
		.click(tag.get(0))
		.click(tag.get(1))
		.click(tag.get(5)).build().perform();
		
		
		
		
		
		
		
	}
}
