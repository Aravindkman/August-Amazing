package com.google.msedge.opening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tooltip {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
	
		
		browser.get("http://www.leafground.com/pages/tooltip.html");
		
		 WebElement tip = browser.findElement(By.id("age"));
		 
		 String tool = tip.getAttribute("title");
		 
		 System.out.println(tool);
}
}