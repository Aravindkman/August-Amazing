package com.google.msedge.opening;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Download {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
	
		
		browser.get("http://www.leafground.com/pages/download.html");
		
		 WebElement down = browser.findElement(By.partialLinkText("Excel"));
		 
		 down.click();
		 
		 File loco = new File("C:\\Users\\AK\\Music\\100 Days of Code - The Complete Python Pro Bootcamp for 2021-1");
		 
		 File[] tion = loco.listFiles();
		 
		 for(File present: tion)
		 {
			 if(present.getName().equals("download.xls"))
			 {
				 System.out.println("file found");
				 break;
			 }else
				 System.out.println("not found");
			 break;
		 }
		 
		 
	}

}
