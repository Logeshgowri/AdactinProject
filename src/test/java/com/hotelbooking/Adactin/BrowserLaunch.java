package com.hotelbooking.Adactin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
	@Test()
	public void window() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Adactin\\Chromedriver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.amazon.com/");
		a.manage().window().maximize();
		a.quit();
	} 
	@Test()
	private void man() {
		System.out.println("Manage");
	}
	@Test()
	private void women() {
		System.out.println("WorkHard");
	}

}
