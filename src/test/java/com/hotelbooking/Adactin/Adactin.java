package com.hotelbooking.Adactin;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adactin extends AdactinMethods{
	@Test
	static void home() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Adactin\\Chromedriver\\chromedriver.exe");
		WebDriver i = new ChromeDriver();
		i.get("https://adactinhotelapp.com/");
		Username(i).sendKeys("logi2211");
		password(i).sendKeys("Logi@11");
		login(i).click();
	}
	@Test (dependsOnMethods = "home")
	public void Search() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Adactin\\Chromedriver\\chromedriver.exe");
		WebDriver i = new ChromeDriver();
//		i.get("https://adactinhotelapp.com/SearchHotel.php");
		location(i);
	}
}



