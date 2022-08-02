package com.google.msedge.opening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag =browser.findElement(By.id("draggable"));
		
		
		
		WebElement drop =browser.findElement(By.id("droppable"));
		
Actions dd = new Actions(browser);
		
		//dd.clickAndHold(drag).moveToElement(drop).build().perform();
		 

dd.dragAndDrop(drag, drop).build().perform();
	}
		
		
}
