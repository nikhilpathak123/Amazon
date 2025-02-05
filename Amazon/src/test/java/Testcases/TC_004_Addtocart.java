package Testcases;

import org.testng.annotations.Test;

import POM.Addtocart;
import POM.Loginpage;
import POM.Passwordpage;
import TestBase.BaseClass;

public class TC_004_Addtocart extends BaseClass 
{
	@Test
	public void Verify_Addtocart_Functionality()
	{
		Loginpage lp = new Loginpage(driver);
		lp.phonenumber("Do not share user id");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.continuebtn();
		
		Passwordpage pg = new Passwordpage(driver);
		pg.passwordfiled("Do not share password");
		pg.signbtn();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Addtocart atc =new Addtocart(driver);
		atc.clickaddtocart();
		System.out.println("This is add to cart page title:- " + driver.getTitle());
	}

}
