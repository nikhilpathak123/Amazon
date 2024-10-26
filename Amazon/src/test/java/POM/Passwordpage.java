package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Passwordpage extends Basepage {

	public Passwordpage(WebDriver driver) {
		super(driver);
	}
		
		@FindBy
		(xpath = ("//input[@id = 'ap_password']"))
		WebElement txtpassword;
		
		
		@FindBy
		(xpath = ("//input[@id='signInSubmit']"))
		WebElement btnsignin;
		
		public void passwordfiled(String pwd) {
			txtpassword.sendKeys(pwd);
		}
		
		
		public void signbtn() {
			btnsignin.click();
		}
		
		
		
		
		
	}


