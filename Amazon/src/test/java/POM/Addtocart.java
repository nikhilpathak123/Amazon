package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Addtocart extends Basepage 
{
	WebDriver driver;
	public Addtocart (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//id = nav-cart-count-container
	@FindBy(xpath="//div[@id='nav-cart-count-container']")
	WebElement txt_addtocart;
	
	//Action method to click on addtocart button
	public void clickaddtocart()
	{
		txt_addtocart.click();
	}
	
	
	}