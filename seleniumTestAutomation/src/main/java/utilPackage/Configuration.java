package utilPackage;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import letzNavApplicationsToTest.clarityPPM;
import productComponents.letzNavPlayer;

public class Configuration {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	letzNavPlayer player;
	clarityPPM clarity;
	ExcelReader data;
	String component="player";
	ExtensionInstaller installer;
	
	public void letzNavConfig(WebDriver driver,ExtentReports report,ExtentTest test,letzNavPlayer player,ExcelReader data ) {
		
	}
	
	
}
