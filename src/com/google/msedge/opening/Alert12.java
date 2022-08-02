package com.google.msedge.opening;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert12 {
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement box1 = browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		
		box1.click();
		
		Alert alt = browser.switchTo().alert();
		
		alt.accept();
		
		WebElement box2 = browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		
		box2.click();
		
		Alert alt1 = browser.switchTo().alert();
		
		alt1.dismiss();
		
		WebElement box3 = browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		
		box3.click();
		
		Alert alt2 = browser.switchTo().alert();
		
		alt2.sendKeys("duckling");
		
		alt2.accept();
		
		
		
		
		
	}

}
