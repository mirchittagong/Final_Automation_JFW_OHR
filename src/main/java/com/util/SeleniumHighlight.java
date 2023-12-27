package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHighlight {
	
public static void getColor(WebDriver driver, WebElement element) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void getColor(WebDriver driver, WebElement element, String color) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='3px solid "+color+"'", element);
	}

}
