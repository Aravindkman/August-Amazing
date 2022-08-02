package com.google.msedge.opening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radio {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement box1 = browser.findElement(By.id("Yes"));
		
		box1.click();
		
		WebElement box3 = browser.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]"));
		
		box3.click(); 
		
		
		WebElement box21 = browser.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input[1]"));
		
		WebElement box22 = browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		
		boolean check = box21.isSelected();
		
		boolean check2 = box22.isSelected();
		
		
		System.out.println(check);
		System.out.println(check2);
		
	}

}
