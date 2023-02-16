package com.hotelbooking.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinMethods {
	public static WebElement Username(WebDriver i) {
		return i.findElement(By.id("username"));
	}
	public static WebElement password(WebDriver i) {
		return i.findElement(By.id("password"));
	}
	public static WebElement login(WebDriver i) {
		return i.findElement(By.id("login"));
	}
	public WebElement location(WebDriver i) {
		  WebElement findElement = i.findElement(By.id("location"));
		  Select a = new Select(findElement);
		  a.selectByValue("Melbourne");
		return findElement;	
	}
}

	


