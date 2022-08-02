package com.google.msedge.opening;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.swing.text.AbstractDocument.Content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Upload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
		
		WebDriver browser = new EdgeDriver();
		
		browser.get("http://www.leafground.com/pages/upload.html");
		
		WebElement upload = browser.findElement(By.name("filename"));
		
		upload.click();
		
		String file ="C:\\Users\\AK\\Music\\100 Days of Code - The Complete Python Pro Bootcamp for 2021-1\\TutsNode.com";
		
		StringSelection loco = new StringSelection(file);
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(loco, null);
		
		
		Robot sei = new Robot();
		
		sei.keyPress(KeyEvent.VK_CONTROL);
		
		sei.keyPress(KeyEvent.VK_V);
		
		sei.keyRelease(KeyEvent.VK_V);
		
		sei.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
		

	}

}
