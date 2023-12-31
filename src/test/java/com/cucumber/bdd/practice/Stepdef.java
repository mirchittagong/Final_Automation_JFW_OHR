package com.cucumber.bdd.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.LoginPage;
import com.util.BaseConfig;
import com.util.SeleniumHighlight;
import com.util.SeleniumWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	WebDriver driver;
	BaseConfig obj = new BaseConfig();
	LoginPage pom = new LoginPage();
	
	
	@Given ("Open a brower")
	public void Open_a_brower() {
		driver = new ChromeDriver();
		
	}
	
	@Given ("Go to application URL")
	public void Go_to_application_URL() throws Exception {
	
		driver.get(obj.getConfig("URL"));
		driver.manage().window().maximize();
		//wait for HTML load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
	}
	
	@When ("Put valid user")
	public void Put_valid_user() throws Exception {
		
		driver.findElement(pom.user).sendKeys(obj.getConfig("USER"));	
	}
	
	@When ("Put Valid password")
	public void Put_Valid_password() throws Exception {
		
		driver.findElement(pom.pass).sendKeys(obj.getConfig("PASSWORD"));
	}
	
	@When ("Click Login")
	public void Click_Login() {
		
		driver.findElement(pom.loginBtn).click();
		
	}
	
	@Then ("If Logout Btn visible then test is pass")
	public void If_Logout_Btn_visible_then_test_is_pass() throws InterruptedException {
	
		Thread.sleep(2000);
		
		SeleniumHighlight.getColor(driver, driver.findElement(pom.dropdown), "black");
		driver.findElement(pom.dropdown).click();
		
		//driver.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
		
		WebElement logout = driver.findElement(pom.logoutBtn);
		
		SeleniumWait.getExplicitWait(driver, logout);
		SeleniumHighlight.getColor(driver, driver.findElement(pom.logoutBtn), "blue");
				
		//WebElement logout=driver.findElement(By.xpath("((//*[@class='oxd-userdropdown-link'])[4]"));
		boolean logOutFound = logout.isDisplayed();
		System.out.println(logOutFound);
		
		//driver.quit();
			
		
	}
	
}
