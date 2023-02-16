package com.hotelbooking.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	
	public void SelectByValue(WebDriver i) {
		WebElement element = i.findElement(By.id("location"));
		Select ab = new Select(element);
		ab.selectByValue("Melbourne");
	}
	
	public WebElement location(WebDriver i) {
		 return i.findElement(By.id("location"));
	}

}
