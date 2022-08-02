package com.google.msedge.opening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Textbox {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox=browser.findElement(By.id("email"));
		
		emailBox.sendKeys("akman@gmail.com");
		
		WebElement appendBox=browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		
		appendBox.sendKeys("Partha");
		
		WebElement textBox=browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		
		String value= textBox.getAttribute("value");
		
		System.out.println(value);
		
		WebElement clearBox=browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		
		clearBox.clear();
		
		WebElement disabledbox=browser.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		
		boolean enabled = disabledbox.isEnabled();
		
		System.out.println(enabled);
		
		
		
		
	}

}
