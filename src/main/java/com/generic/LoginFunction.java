package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page.object.model.LoginPage;
import com.util.BaseConfig;
import com.util.SeleniumHighlight;
import com.util.SeleniumWait;

public class LoginFunction {//  Class Starts Here
	
	
	public void getLogin() throws Exception {
	
		//Open Browser
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		// go to the application page
		
		BaseConfig obj = new BaseConfig();
		//obj.getConfig("URL");
		
		LoginPage pom = new LoginPage();
		
		driver.get(obj.getConfig("URL"));
		//maximize the browser
		driver.manage().window().maximize();
		//wait for HTML load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		//Thread.sleep(3000);
		
		
		
		//user ID ==> send user ID
		
		SeleniumHighlight.getColor(driver, driver.findElement(pom.user), "red");
		driver.findElement(pom.user).sendKeys(obj.getConfig("USER"));
		//password ==> send password
		
		Thread.sleep(2000);
		
		SeleniumHighlight.getColor(driver, driver.findElement(pom.pass), "green");
		driver.findElement(pom.pass).sendKeys(obj.getConfig("PASSWORD"));
		//Click Login
		//driver.findElement(By.xpath("//*[@type='submit'] ")).click();
		
		Thread.sleep(2000);
				
		SeleniumHighlight.getColor(driver, driver.findElement(pom.loginBtn), "blue");
		driver.findElement(pom.loginBtn).click();
		
		//Logout == > drop down list
		
		Thread.sleep(2000);
		
		SeleniumHighlight.getColor(driver, driver.findElement(pom.dropdown), "green");
		driver.findElement(pom.dropdown).click();
		
		//driver.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
		
		WebElement logout = driver.findElement(pom.logoutBtn);
		
		SeleniumWait.getExplicitWait(driver, logout);
		SeleniumHighlight.getColor(driver, driver.findElement(pom.logoutBtn), "blue");
				
		//WebElement logout=driver.findElement(By.xpath("((//*[@class='oxd-userdropdown-link'])[4]"));
		boolean logOutFound = logout.isDisplayed();
		System.out.println(logOutFound);
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	

		
}// Class Ends Here
