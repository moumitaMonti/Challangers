package com.ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
 @FindBy (linkText="SIGN IN")
 WebElement linksignin;
 public void clicksignin() {
	 linksignin.click();
 }
 WebDriver driver;
 public Homepage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
}
