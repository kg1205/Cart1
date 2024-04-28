package com.cart.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.testPageObjects.HomePage;
import com.testPageObjects.LoginPage;
import com.testPageObjects.WomenPage;

public class Tc_001_Login extends BaseClass {
	@Test(priority = 1)
	public void login() {
		driver.get(baseurl);
		logg.info("url has opened");
		LoginPage l=new LoginPage(driver);
		l.email(username);
		logg.info("username entered");
		l.password(password);
		logg.info("password has entered");
		l.click();
		logg.info("clicked the signin");
	}
	@Test(priority = 2)
	public void HomePages() {
		HomePage h=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		h.orderlink();
		WebDriverWait w=new WebDriverWait(driver, 10);
		
		h.downloadlink();
		
		h.wishlistlink();
		h.addresslink();
		h.actionlink();
		h.paymentlink();
	}
	@Test(enabled = false)
	public void womenpages() {
		WomenPage w=new WomenPage();
		w.movetowomen();
		
	}
}
