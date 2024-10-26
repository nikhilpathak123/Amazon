package Testcases;

import org.testng.annotations.Test;

import POM.Loginpage;
import POM.Passwordpage;
import TestBase.BaseClass;

@Test
public class TC_002_Loginpage extends BaseClass {
	
	public void Verify_Login_Functionality() {
		Loginpage lp = new Loginpage(driver);
		lp.phonenumber("9654792993");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.continuebtn();
		
		Passwordpage pg = new Passwordpage(driver);
		pg.passwordfiled("Apana password share mat kerna");
		pg.signbtn();
		
		
	}

}
