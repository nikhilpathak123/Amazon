package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import POM.Loginpage;
import POM.Passwordpage;
import TestBase.BaseClass;
import Utility.Listneer;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003_Crossbrowser extends Passwordpage {

	WebDriver driver;
	//	 A default constructor public TC_003_Crossbrowser() is added to
	//avoid issues with TestNG instantiation.
	public TC_003_Crossbrowser() {
		super(null);
	}

	@BeforeMethod
	@Parameters("browser")
	public void launchbrowser(String browser) {

		switch(browser.toLowerCase()) 
		{

		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case"msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			driver = null;
			break;
		}
	}
	
	BaseClass sc = new BaseClass();
	//sc.setup();

		//Test Method to verify login
		@Test
		public void verifyLogin () {
			
			Loginpage lp = new Loginpage(driver);
			lp.phonenumber("do not share");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lp.continuebtn();

			Passwordpage pg = new Passwordpage(driver);
			pg.passwordfiled("do not share");
			pg.signbtn();		
			
			Listneer ts = new Listneer();
			//ts.onTestSuccess;
			
			//1) Take full page, convert webdriver object into screenshot takesscreenshot interface
			/*TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File targetfile = new File(System.getProperty("user.dir") + "\\Screenshot folder\\fullpage.png");
			source.renameTo(targetfile);
			*/
//			//2) Takescreenshot of specific elemet of webpage
//			WebElement ts = driver.findElement(By.cssSelector("div[id='anonCarousel1'] ol[class='a-carousel']"));
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			File targetfile = new File(System.getProperty("user.dir") + "\\Screenshot folder\\specficpage.png");
//			source.renameTo(targetfile);
//			
//			// convert testng XML to run test cases 
		}
		

	}


