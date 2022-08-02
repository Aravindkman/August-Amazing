package com.google.msedge.opening;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Windows {

	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/Window.html");
		

		String oldwin = browser.getWindowHandle();
		
		WebElement wind =browser.findElement(By.id("home"));
		
		
		wind.click();
		
		
		Set<String> handle = browser.getWindowHandles();
		
		for (String newwin : handle) {
			
			browser.switchTo().window(newwin);
			
		} 
		
		browser.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		
		browser.close();
		
		browser.switchTo().window(oldwin);
		
		WebElement multi = browser.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		
		multi.click();
		
		
		int noof = browser.getWindowHandles().size();
		
		System.out.println(noof);
		
		
		Set<String> closs=browser.getWindowHandles();
		
		for (String clossing : closs) {
			
			if(!clossing.equals(wind)) {
				
				browser.switchTo().window(clossing);
				browser.close();
			}
			}
			
			browser.quit();
		}
		
		
		
		

	}

