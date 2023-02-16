package com.hotelbooking.Adactin;

import java.lang.module.FindException;

import org.testng.annotations.Test;

public class Browser {
	@Test()
	private void signup() {
		System.out.println("used to signup");
		throw new FindException();
	}
	@Test()
	private void login() {
		System.out.println("used to login");
	}
	@Test(dependsOnMethods = "signup", alwaysRun = true)
	private void searchproduct() {
		System.out.println("used for product search");
	}
	//	@Test()
	//	private void addtocart() {
	//		System.out.println("product added to cart");
	//	}
	//	@Test()
	//	private void payment() {
	//		System.out.println("make the payment");
	//	}

}
