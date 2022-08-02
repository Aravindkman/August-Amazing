package com.google.msedge.opening;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");

		WebDriver browser = new EdgeDriver();

		browser.get("http://www.leafground.com/pages/Button.html");

		WebElement xyposition = browser.findElement(By.id("position"));

		Point xyaxis = xyposition.getLocation();

		int xvalue = xyaxis.getX();
		int yvalue = xyaxis.getY();

		System.out.println("The X & Y axis are"+xvalue+""+yvalue);
		
		WebElement Buttoncolour = browser.findElement(By.id("color"));
		
		String colour = Buttoncolour.getCssValue("background-color");
		
		System.out.println("the button colour is " +colour);
			
		WebElement buttonsize= browser.findElement(By.id("size"));
		
		int height =buttonsize.getSize().getHeight();
		int width =buttonsize.getSize().getWidth();
		
		System.out.println("the height is "+height+"thw width is "+width);
		
		WebElement gotohomepage=browser.findElement(By.id("home"));

		gotohomepage.click();
	
	}

}
