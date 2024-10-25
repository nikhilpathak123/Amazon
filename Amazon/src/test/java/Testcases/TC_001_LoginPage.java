package Testcases;

import org.testng.annotations.Test;

import POM.Loginpage;
import TestBase.BaseClass;

public class TC_001_LoginPage extends BaseClass {
	
	@Test
	public void verify_Login_Functionality() {
		Loginpage lp = new Loginpage(driver);
		lp.phonenumber("9654792993");
		lp.continuebtn();
	}
	
	

}
