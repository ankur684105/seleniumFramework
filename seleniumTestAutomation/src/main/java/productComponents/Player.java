package productComponents;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Player {
	
	public WebDriver driver;

	String nextButton = "//div[@class='product-buttons']/button[text()='Next']";
	String button = "//div[@class='product-buttons']/button";
	String playerButton = "//banner[@class='banner-player']";
	String needHelp = "//product-frame/banner/div/span[text()='Need Help?']";
	String playerFeedBack = "//div[@class='product-content']/feedback-form[text()]";

	public Player(WebDriver driver) {
		this.driver = driver;

	}

	public void validateFeedBack() {

		boolean feedBack = driver.findElement(By.xpath(playerFeedBack)).isDisplayed();
		Assert.assertTrue(feedBack);
	}

	public void openproductPlayer() {
		driver.findElement(By.xpath(playerButton)).click();
	}

	public void selectFlowToPlay(String flowValue) {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			String js = "a=$('[class=\\\"base-row\\\"]')[0];";
			String js1 = js.replace("0", flowValue);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript(js1);
			executor.executeScript("a.click();");
			// driver.findElement(By.xpath(finalXpath)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnNextButton() {
		driver.findElement(By.xpath(button)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public boolean validateLauncherPosition(String xpathOfElement, String valueOfNavTip, int padding) {
		boolean result = false;
		try {
			WebElement element = driver.findElement(By.xpath(xpathOfElement));
			String xpathOfLauncher = "//p[contains(text(),'LauncherText')]/../../../../../launcher-indicator/div/div";
			String finalXpathLauncher = xpathOfLauncher.replace("LauncherText", valueOfNavTip);
			WebElement launcher = driver.findElement(By.xpath(finalXpathLauncher));
			Point elementCoordinates = element.getLocation();
			Point launcherCoordinates = launcher.getLocation();
			float xElement = elementCoordinates.getX();
			float yElement = elementCoordinates.getY();
			float elementHeight = element.getSize().height;
			float elementWidth = element.getSize().width;
			float launcherX = launcherCoordinates.getX();
			float launcherY = launcherCoordinates.getY();

			float validateXvalue = elementWidth + xElement + padding;
			float validateYvalue = yElement + ((elementHeight - 26) / 2);
			// System.out.println(validateXvalue);
			// System.out.println(validateYvalue);
			// System.out.println(launcherX);
			// System.out.println(launcherY);

			if (launcherX == validateXvalue || launcherX <= validateXvalue + 2 || launcherX >= validateXvalue - 2) {
				if (launcherY == validateYvalue || launcherY <= validateYvalue + 1 || launcherY >= validateYvalue - 1) {
					result = true;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean validateLauncherNavigation(String xpathOfElement, String valueOfNavTip) {
		boolean result = false;
		try {
			String xpathOfLauncher = "//p[contains(text(),'LauncherText')]/../../../../../launcher-indicator/div/div";
			String finalXpathLauncher = xpathOfLauncher.replace("LauncherText", valueOfNavTip);
			WebElement launcher = driver.findElement(By.xpath(finalXpathLauncher));
			launcher.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Set<String> windowHandles = driver.getWindowHandles();
			if (windowHandles.size() > 1) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}