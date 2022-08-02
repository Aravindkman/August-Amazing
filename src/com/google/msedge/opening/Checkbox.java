package com.google.msedge.opening;

import java.security.acl.LastOwnerException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		browser.get("http://www.leafground.com/pages/checkbox.html");
		
		
		
		WebElement box1 = browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		
		box1.click();
		
		browser.manage().window().maximize();
	
		
		
		
		WebElement box2 = browser.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input"));
		
		boolean check3 = box2.isSelected();
		
		System.out.println(check3);
		
		
		WebElement box3 = browser.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[1]"));
		
		if(box3.isSelected())
		{
			box3.click();
		}		
				
		WebElement box4 = browser.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[2]"));
		
		if(box4.isSelected())
		{
		   box4.click();
		}
			
			
		JavascriptExecutor js = (JavascriptExecutor)browser;
		
		js.executeScript("scrollBy(0,2500)");
		
		
		WebDriverWait wait = new WebDriverWait(browser, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable();
		
		browser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
	}

}
