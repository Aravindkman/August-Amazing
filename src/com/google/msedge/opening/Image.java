package com.google.msedge.opening;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Image {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/Image.html");
		
		WebElement img = browser.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		
		img.click();
		
		browser.navigate().back();
		
		WebElement broken = browser.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		if(broken.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image is broken");
		}
		
	}

}
