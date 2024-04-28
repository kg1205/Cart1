package com.testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WomenPage {

	WebDriver driver;

	public void womenpage(WebDriver d) {
		driver = d;
	}

	By womenlink = By.xpath("//*[@id=\"ui-id-4\"]/span[1]");
	By tops = By.id("ui-id-9");
	By jackets = By.id("ui-id-11");

	Actions A = new Actions(driver);

	public void movetowomen() {
		A.moveToElement(driver.findElement(womenlink));

		A.moveToElement(driver.findElement(tops));

		A.moveToElement(driver.findElement(jackets)).click();
	}

}
