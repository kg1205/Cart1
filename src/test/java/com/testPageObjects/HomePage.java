package com.testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver d) {
		driver = d;
	}

	By orderlnk = By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a");
	By downldlnk = By.partialLinkText("My Downloadable Products");
	By wshlstlnk = By.partialLinkText("My Wish List");
	By adrsbk = By.partialLinkText("Address Book");
	By actinf = By.partialLinkText("Account Information");
	By strdpaymt = By.partialLinkText("Stored Payment Methods");

	public void orderlink() {
		driver.findElement(orderlnk).click();
	}

	public void downloadlink() {
		driver.findElement(downldlnk).click();
	}

	public void wishlistlink() {
		driver.findElement(wshlstlnk).click();

	}

	public void addresslink() {
		driver.findElement(adrsbk).click();
	}

	public void actionlink() {
		driver.findElement(actinf).click();
	}

	public void paymentlink() {
		driver.findElement(strdpaymt).click();
	}
}
