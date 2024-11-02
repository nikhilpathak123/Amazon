package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import POM.Loginpage;
import POM.Passwordpage;
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

		
		
		//Test Method to verify login
		@Test
		public void verifyLogin () {
			driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();

			Loginpage lp = new Loginpage(driver);
			lp.phonenumber("Password mat share kerna");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lp.continuebtn();

			Passwordpage pg = new Passwordpage(driver);
			pg.passwordfiled("Password mat share kerna");
			pg.signbtn();
			
			// convert testng XML to run test cases 
		}

	}


