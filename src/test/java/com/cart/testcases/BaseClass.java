package com.cart.testcases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.testutilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	ReadConfig read=new ReadConfig();
	public String baseurl=read.geturl();
	public String username=read.getusername();
	public String password=read.paswrd();
	
	public static Logger logg;
	
	@BeforeTest
	public void setup() {
		logg=Logger.getLogger("cart");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", read.chrome());
		driver=new ChromeDriver();
		
	}

}
