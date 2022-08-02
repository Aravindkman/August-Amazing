package com.google.msedge.opening;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng {

	long start = System.currentTimeMillis();

	WebDriver browser;

	@BeforeSuite
	private void open() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AK\\Documents\\Selinium web driver\\msedgedriver.exe");

		browser = new EdgeDriver();

	}

	@Test(priority=2)
	private void yahoo() {
		// TODO Auto-generated method stub

		browser.get("http://www.yahoo.com");

	}

	@Test(priority=1)

	public void google() {
		// TODO Auto-generated method stub

		browser.get("http://www.google.com");

	}

	@Test(priority=0)
	private void bing() {
		// TODO Auto-generated method stub

		browser.get("http://www.bing.com");
	}

	@AfterSuite
	private void close() {
		// TODO Auto-generated method stub

		browser.quit();

		long end = System.currentTimeMillis();

		System.out.println(end);

		long total = end - start;

		System.out.println(total);

	}

}
