package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	
	@BeforeSuite
	public void beforeSuit() {
		
		System.out.println("Before Suit: Before Everything");
	}
	
	@BeforeGroups
	public void beforeGroup() {
		
		System.out.println("Before Group: Before Every Group");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class: Before Classes");
	}
	
	@BeforeTest
	public void setup() {
		
		System.out.println("Before Test: Setup");
	}
	@BeforeMethod
	public void method1() {
		
		System.out.println("Before Method: method1");
	}
	
	@Test(groups = "Smoke")
	public void getLogin() {
		
		//Actual code
		
		System.out.println("Login Test");
	}

	@Test(groups = {"Smoke","Regration"})
	public void getPayment() {
		
		//Actual code
		
		System.out.println("Payment Test");
	}

	@AfterMethod
	public void method22() {
		
		System.out.println("After Method: method2");
	}
	@AfterTest
	public void teardown() {
		
		System.out.println("After Test: Close All Connection");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class: After Classes");
	}
	@AfterGroups
	public void afterGroup() {
		
		System.out.println("After Group: After Every Group");
	}
	
	@AfterSuite
	public void afterSuit() {
		
		System.out.println("After Suit: After Everything");
	}
	
	
	
}
