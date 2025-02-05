package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listneer {
	
	public WebDriver driver;
	
	public class Demo1 implements ITestListener  {

		public void onStart(ITestContext context) {
			// not implemented
		}

		public void onTestStart(ITestResult result) {
			// not implemented
		}

		public void onTestSuccess(ITestResult result) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File targetfile = new File(System.getProperty("user.dir") + "\\Screenshot folder\\21nov.png");
			source.renameTo(targetfile);
			System.out.println("ScreenShot captured");
		}

		public void onTestFailure(ITestResult result) {
			// not implemented
		}

		public void onTestSkipped(ITestResult result) {
			// not implemented
		}
		public void onFinish(ITestContext context) {
			// not implemented
		}
	}
}
