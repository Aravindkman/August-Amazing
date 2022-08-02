package com.google.msedge.opening;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Table {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/table.html");
		
	List<WebElement> column = browser.findElements(By.tagName("th"));
		
		int coco = column.size();
		
		System.out.println(coco);
		
		
		List<WebElement> row = browser.findElements(By.tagName("tr"));
		
		int momo = row.size();
		
		System.out.println(momo);
		
		WebElement percent = browser.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
		String str = percent.getText();
		
		System.out.println(str);
		
		List<WebElement> pick = browser.findElements(By.xpath("//td[2]"));
		
		List<Integer> num = new ArrayList<Integer>();
		
		for (WebElement lowest : pick) {
			
			String str11= lowest.getText().replace("%", "");
		int num1 = Integer.parseInt(str11);	
		
		num.add(num1);
		
		
			
			
		}
		
		System.out.println(num);
		
		int num3= Collections.min(num);
		
		System.out.println(num3+"%");
		
		
		String str22 = Integer.toString(num3);	
		
		System.out.println(str22+"%");
		
	}
	
}
