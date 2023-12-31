package com.regration;

import org.testng.annotations.Test;

import com.generic.LoginFunction;

public class TestRunWithTestNGLogin {
	
	@Test(priority = 0, description = "Login Function", groups = {"Smoke", "Regration", "Unit Test" }) 

	public void getLogin() throws Exception {
		
		LoginFunction obj = new LoginFunction();  
		
		obj.getLogin();
		
	}
	
	
}
