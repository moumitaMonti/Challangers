package com.ebay.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebayBase {

	public WebDriver driver;
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
        
        public void closeAllBroswer() {
        	driver.quit();
           }
}
