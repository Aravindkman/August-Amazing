package com.google.msedge.opening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class frame {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/frame.html");
		
		browser.switchTo().frame(0);
		
		WebElement fname =browser.findElement(By.id("Click"));
		
		fname.click();
		
		String str = browser.findElement(By.id("Click")).getText();
		
		System.out.println(str);
		
		browser.switchTo().defaultContent();
		
		browser.switchTo().frame(1);
		
		browser.switchTo().frame("frame2");
		
		WebElement fname2 = browser.findElement(By.id("Click1"));
		
		fname2.click();
		
		browser.switchTo().defaultContent();
		
		List<WebElement> fcount = browser.findElements(By.tagName("iframe"));
		
		int dood = fcount.size();
		
		System.out.println(dood);
		
		
		
		
		
		
		
		
		
		
	}
		
}
