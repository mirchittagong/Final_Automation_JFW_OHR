package com.page.object.model;

import org.openqa.selenium.By;

public class LoginPage {

	//Store all Login related Xpath
	 
	
	public By user = By.xpath("//*[@name='username']");
	public By pass= By.xpath("//*[@type='password']");
	public By loginBtn = By.xpath("//*[text()=' Login ']");
	public By dropdown = By.xpath("//*[@class='oxd-userdropdown-name']");
	public By logoutBtn = By.xpath("//*[text()='Logout']");
	
	
}
