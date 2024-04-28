package com.luma.com.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lists {
	public static WebDriver driver;

	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		driver.manage().window().maximize();
	}

	public static void login() {
		driver.findElement(By.id("email")).sendKeys("gani@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ganesh123");
		driver.findElement(By.name("send")).click();
	}

	public static void main(String[] args) {
		setup();
		login();

	}

}
