package utilPackage;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ApplicationsToTest.clarityPPM;
import productComponents.Player;

public class Configuration {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	Player player;
	clarityPPM clarity;
	ExcelReader data;
	String component="player";
	ExtensionInstaller installer;
	
	public void letzNavConfig(WebDriver driver,ExtentReports report,ExtentTest test,Player player,ExcelReader data ) {
		
	}
	
	
}
