package com.cucumber.bdd.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
		
		plugin="json:target/cucumber.json", //.json report  
		features = "./src/main/resources/Login.feature", //feature file location
		glue = "com.cucumber.bdd.practice", // Setp def pkg name
		tags = "@Smoke"
		)
public class Runner extends AbstractTestNGCucumberTests{
	//extends AbstractTestNGCucumberTests Hooks TestNG with Cucumber
	
	@BeforeTest
	public void setup () {
		
	}
	
	@Test
	public void test1 () {
		
	}
	
	
	@AfterTest
	public void teardown () {
		
	}

}
