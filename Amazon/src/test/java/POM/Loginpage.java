package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
	
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy
	(xpath = ("//input[@id='ap_email']"))
	WebElement txtphonenumber;
	
	@FindBy
	(xpath = ("//input[@id='continue']"))
	WebElement btncontinue;
	
	public void phonenumber(String phn) {
		txtphonenumber.sendKeys(phn);	
	}
	
	public void continuebtn () {
		btncontinue.click();
	}
	
	
	

}
