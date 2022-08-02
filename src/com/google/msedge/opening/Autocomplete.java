package com.google.msedge.opening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autocomplete {

		
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			
	System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");
			
			WebDriver browser = new EdgeDriver();
			
			browser.get("http://www.leafground.com/pages/autoComplete.html");
			
			WebElement tag = browser.findElement(By.id("tags"));
			
			tag.sendKeys("s");
			
			Thread.sleep(2000);
			
			List<WebElement> bye = browser.findElements(By.xpath("//*[@id='ui-id-1']/li"));
			
			System.out.println(bye.size());
			
			for (WebElement webElement : bye) {
				
				if(webElement.getText().equals("Selenium"))
					
									{
					
					webElement.click();
					
					
					System.out.println("Selectinf from list " +webElement.getText());
					break;
				}else
				{
					System.out.println("notfound");
				}
				
			}	
			
			
			
					

	}

}
