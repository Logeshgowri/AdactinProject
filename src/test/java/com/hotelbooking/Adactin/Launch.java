package com.hotelbooking.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	@Test()
	public void window() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Adactin\\Chromedriver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.myntra.com/");
		a.manage().window().maximize();
		a.quit();

	}
	@Test(dependsOnMethods = "window")
	private void man() {
		System.out.println("Manager");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Adactin\\Chromedriver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.myntra.com/");
		a.manage().window().maximize();
		a.quit();
	}
}