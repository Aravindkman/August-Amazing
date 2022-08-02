package com.google.msedge.opening;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Link {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver  browser = new EdgeDriver();
		
		browser.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement home = browser.findElement(By.xpath("// a[contains(text(),'Home')]"));
		
		home.click();
		
		browser.navigate().back();
		
		
			
		WebElement task1 = browser.findElement(By.partialLinkText("to go without clicking me"));
		
		String store = task1.getAttribute("href");
		 System.out.println("going to : "+store);
		
		 
	 WebElement task2 = browser.findElement(By.linkText("Verify am I broken?"));
		 
		 task2.click();
		 
		 String broken = browser.getTitle();
		 
		 if(broken.contains("404"))
		 {
			 System.out.println("Link Broken");
			 		 }
		browser.navigate().back();
		
		
		WebElement home1 = browser.findElement(By.xpath("// a[contains(text(),'Home')]"));
		
		home1.click();
		 
		browser.navigate().back();
				
		List<WebElement> nooflink = browser.findElement(By.tagName("a"));
		
		int count = nooflink.size();
		
		System.out.println("total link : "+count);
		
		
		
		
		
		}

}
