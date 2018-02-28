package productComponents;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Editor {

	public WebDriver driver;
	String productEditorButton = "//banner[@class='banner-editor']";
	String editorLogOutButton = "//bottom-bar/div/span[@class='mdi mdi-logout']";
	String editorLogin = "//input[@name='product-username']";
	String editorPassword = "//input[@name='product-password']";
	String editorLoginButton = "//button[@class='button-save mat-button']/span[text()='Login']";
	String editorWorkFlowsButton = "//li[@class='home-navigation__workflows']/a[text()='Workflows']";
	String editorCreateNewFlowFormButton = "a[class=top-bar__container__newbtn]";
	String editorWorkFlowList = "//div[@class='flow-list']/flow-row/div/span[2]";
	String editorLaunchers = "//li[@class='home-navigation__launchers']/a";
	String createNewFormText = "//span[text()='New Form']";
	String editorFormName = "//div[@class='input-component']/input";
	String editorElementPicker = "//div[@class='anchors__container']/ul/element-picker/a";
	String editorAnchorStrenght = "//span[@class='anchors__container__strength']";
	String editorSaveFormButton = "//button[@class='button-save mat-button']";
	String addNewLauncher = "//div[@class='validation-item add-validation']/div/span[1]";
	String launcherElementPicker = "//element-picker/a";
	String launcherText = "//iframe[@id='launcherHoverMessage_ifr']";
	String launcherName = "//div[@class='input-component']/input[@name='name']";
	String launcheWorkFlow = "//md-button-toggle[1]";
	String launcherLink = "//md-button-toggle[3]";
	String launcherUrl = "//div/input[@name='urlString']";
	String launcherSave = "//div[@class='editor-validation active']/div/button[@class='button-save']";
	String BackButton = "//span[@class='product-panel-btn back']";
	String editorValidations = "//li[@class='home-navigation__validations']/a";
	String hamburgerMenu = "//span[@class='mdi mdi-dots-vertical product-panel-btn menu']";
	String settingsButton = "//button[@class='button-save mat-menu-item']";
	String status = "//input[@id='md-slide-toggle-1-input']";
	String published = "//input[@id='md-slide-toggle-2-input']";
	String formPageXpath = "//div[@class='form-list']/badge-form-row/div/span[contains(text(),'formPage')]";
	String editorNavTip = "//li[@class='home-navigation__tooltips']/a";
	String editorNewNavTip = "//div[@class='validation-item add-validation']/div/span[1]";
	String NavTipElementPicker = "//div[@class='badge-view__container__select__picker']/element-picker/a";
	String NavTipText = "//iframe[@id='navtipHoverMessage_ifr']";
	String NavTipName = "//div[@class='input-component']/input[@name='name']";
	String NavTipSave = "//div[@class='editor-validation active']/div/button[@class='button-save']";
	String editorNewValidation = "//div[@class='validation-item add-validation']/div";
	String validationName = "//div[@class='input-component']/input[@name='name']";
	String validationSave = "//div[@class='editor-validation active']/div/button[@class='button-save']";
	String validationButton = "//div[@class='validators-list-control']/button";
	String validationRequiredField = "//button[@title='Required field']/div[@class='mat-menu-ripple mat-ripple']";
	String validationLengthConstraint = "//button[@title='Length constraint']/div[@class='mat-menu-ripple mat-ripple']";
	String validationRegularExpression = "//button[@title='Regular expression']/div[@class='mat-menu-ripple mat-ripple']";
	String validationCustomValidation = "//button[@title='Custom validator']/div[@class='mat-menu-ripple mat-ripple']";
	String valMinimumLength = "//div/input[@placeholder='Min. length']";
	String valMaximumLength = "//div/input[@placeholder='Max. length']";
	String afterClickLenConstHeader = "//collapsable-panel[@class='validator-type-1']/div/div[@class='panel-header']";
	String afterClickRegExpHeader = "//collapsable-panel[@class='validator-type-2']/div/div[@class='panel-header']";
	String afterClickCustValHeader = "//collapsable-panel[@class='validator-type-3']/div/div[@class='panel-header']";
	String regularExpressionValue = "//div/input[@placeholder='Regular expression']";
	String regularExpressionErrMsg = "//collapsable-panel[@class='validator-type-2']/div/div/div/div/div/input[@placeholder='Enter error message']";
	String customValidation = "//div[@class='validator-custom']/div/div/textarea";
	String customValidationErrMsg = "//collapsable-panel[@class='validator-type-3']/div/div/div/div/div/input[@placeholder='Enter error message']";
	String cornerLeftTop = "//div[@class='balloon-tooltip-corner left-top']";
	String cornerRightTop = "//div[@class='balloon-tooltip-corner right-top']";
	String cornerTopLeft = "//div[@class='balloon-tooltip-corner top-left']";
	String cornerTopRight = "//div[@class='balloon-tooltip-corner top-right']";
	String left = "//div[@class='balloon-tooltip left']";
	String top = "//div[@class='balloon-tooltip top']";
	String bottom = "//div[@class='balloon-tooltip bottom']";
	String right = "//div[@class='balloon-tooltip right selected']";
	String cornerBottomRight = "//div[@class='balloon-tooltip-corner bottom-right']";
	String cornerBottomLeft = "//div[@class='balloon-tooltip-corner bottom-left']";
	String cornerRightBottom = "//div[@class='balloon-tooltip-corner right-bottom']";
	String cornerLeftBottom = "//div[@class='balloon-tooltip-corner left-bottom']";
	String nextButton = "//md-button-toggle[@id='md-button-toggle-1']";
	String clickOnElement = "//md-button-toggle[@id='md-button-toggle-2']";
	String mouseHoverElement = "//md-button-toggle[@id='md-button-toggle-3']";
	String changeInElement = "//md-button-toggle[@id='md-button-toggle-4']";
	String inputInElement = "//md-button-toggle[@id='md-button-toggle-5']";
	String workflowDoneButton = "//div[@class='flow-step-validation']/button[@class='button']";
	String reselectElement = "//element-picker/a/span[@class='mdi mdi-target']";
	String markEntryPoint = "//md-checkbox[@name='entryPoint']";
	String workFlowDescription = "//iframe[@id='flowDescription_ifr']";
	String workFlowName = "//div[@class='input-component']/input[@name='name']";
	String stepDescription = "//iframe[@id='stepDescription_ifr']";
	String workflowNextStep = "//div[@class='flow-step-validation']/button[@class='button-save']";
	String linkName="//upload-custom-content/div/input[@id='md-input-0']";
	String hyperLink="//upload-custom-content/div/input[@id='md-input-1']";

	JavascriptExecutor executor;

	public Editor(WebDriver driver) {
		this.driver = driver;

	}

	// Click on Launcher button
	public void productEditorClickLauncher() {
		driver.findElement(By.xpath(editorLaunchers)).click();
	}

	public void productEditorClickNavTip() {
		driver.findElement(By.xpath(editorNavTip)).click();
	}

	public void productEditorClickValidations() {
		driver.findElement(By.xpath(editorValidations)).click();
	}

	public void productEditorClickWorkFlows() {
		driver.findElement(By.xpath(editorWorkFlowsButton)).click();
	}

	// Click on Create New FormPage and keyIn name
	public void productCreateNewForm(String formName) {
		try {
		Assert.assertTrue(driver.findElement(By.xpath(createNewFormText)).isDisplayed());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(editorFormName)).sendKeys(formName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	// Click on element picker and select element from applicationToTest
	public void productClickPicker(String editorElementPicker) {
		driver.findElement(By.xpath(editorElementPicker)).click();

	}

	public void productClickPicker() {
		driver.findElement(By.xpath("//div[@class='anchors__container']/ul/element-picker/a")).click();
	}

	public void productSelectElementId(String xpathOfElement) {
		driver.findElement(By.xpath(xpathOfElement)).click();

	}

	// Validate strength identification
	public boolean productValidateIdentificationStrenght() {
		try {
		boolean result = false;
		String strength = driver.findElement(By.xpath(editorAnchorStrenght)).getText();
		if (strength.contains("Strong")) {
			result = true;
		}
		return result;
		}
		catch(Exception e) {
			return false;
		}
	}

	public void productSaveForm() {
		driver.findElement(By.xpath(editorSaveFormButton)).click();
	}

	public void publishFormPage(String tool, String formPage) {
		try {
		String formXpath = formPageXpath.replace("formPage", formPage);
		clickOnComponent(tool);
		driver.findElement(By.xpath(formXpath)).click();
		driver.findElement(By.xpath(hamburgerMenu)).click();
		driver.findElement(By.xpath(settingsButton)).click();
		driver.findElement(By.xpath(status)).click();
		driver.findElement(By.xpath(published)).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public void clickOnComponent(String tool) {
		try {
		if (tool.equalsIgnoreCase("launchers")) {
			productEditorClickLauncher();
		} else if (tool.equalsIgnoreCase("workflows")) {
			productEditorClickWorkFlows();
		} else if (tool.equalsIgnoreCase("navtips")) {
			productEditorClickNavTip();
		} else if (tool.equalsIgnoreCase("validations")) {
			productEditorClickValidations();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	String formPageNameXpath="//div[@class='base-row']/span[text()='Name']";
	//take form page name unique
	public void selectFormPage(String formPageName) {
		String xpath=formPageNameXpath.replace("Name", formPageName);
		driver.findElement(By.xpath(xpath)).click();
				
	}

	public void productLoginToTool(String id, String pwd) {
		productEditorLogin(id, pwd);
		}

	// Function to create new form page on any tool page
	public void productCreateNewForm(String id, String pwd, String tool, String formName) {
		try {
		productLoginToTool(id, pwd);
		clickOnComponent(tool);
		productCreateNewFlow();
		productCreateNewForm(formName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void productCreateLauncher(String elementXpath, String launcherOption, String launcherTxt,
			String launcherTitle, String linkUrl) {
		Assert.assertTrue(driver
				.findElement(By.xpath(
						"//div[@class='form-connected connected']/span[contains(text(),'Connected to form page')]"))
				.isDisplayed());
		driver.findElement(By.xpath(addNewLauncher)).click();
		driver.findElement(By.xpath(launcherElementPicker)).click();
		driver.findElement(By.xpath(elementXpath)).click();
		driver.findElement(By.xpath(launcherText)).sendKeys(launcherTxt);
		driver.findElement(By.xpath(launcherName)).clear();
		driver.findElement(By.xpath(launcherName)).sendKeys(launcherTitle);
		if (launcherOption.equalsIgnoreCase("workflow")) {
			driver.findElement(By.xpath(launcheWorkFlow)).click();

		} else if (launcherOption.equalsIgnoreCase("link")) {
			driver.findElement(By.xpath(launcherLink)).click();
			driver.findElement(By.xpath("//pick-custom-content/md-select/div")).click();
			driver.findElement(By.xpath("//md-option[@class='mat-option' and contains(text(),'Srin')]")).click();
//			driver.findElement(By.xpath("//md-option[@class='mat-option' and contains(text(),'Add new Content')]")).click();
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//			driver.findElement(By.xpath(linkName)).sendKeys(" Auto1");
//			driver.findElement(By.xpath(hyperLink)).sendKeys(linkUrl);
		}
		driver.findElement(By.xpath(launcherSave)).click();
		driver.findElement(By.xpath(BackButton)).click();

	}
	
	public void productCreateNavtip(String elementXpath, String navTipText, String navTipName) {
		//String navTxt = "//badge/div[1]/navtip/div/div/div/p";
		Assert.assertTrue(driver
				.findElement(By.xpath(
						"//div[@class='form-connected connected']/span[contains(text(),'Connected to form page')]"))
				.isDisplayed());
		driver.findElement(By.xpath(editorNewNavTip)).click();
		driver.findElement(By.xpath(NavTipElementPicker)).click();
		driver.findElement(By.xpath(elementXpath)).click();
		driver.findElement(By.xpath(NavTipText)).sendKeys(navTipText);
		
		driver.findElement(By.xpath(NavTipName)).clear();
		driver.findElement(By.xpath(NavTipName)).sendKeys(navTipName);
		driver.findElement(By.xpath(NavTipSave)).click();
		driver.findElement(By.xpath(BackButton)).click();
	}

	public void productRequiredFieldValidation() {
		driver.findElement(By.xpath(validationButton)).click();
		executor = (JavascriptExecutor) driver;
		String js = "a=$('[class=\\\"mat-menu-item\\\"]')[0];";
		executor.executeScript(js);
		executor.executeScript("a.click();");

	}

	public void productLengthConstraint(String min, String max) {
		driver.findElement(By.xpath(validationButton)).click();
		executor = (JavascriptExecutor) driver;
		String js = "a=$('[class=\\\"mat-menu-item\\\"]')[1];";
		executor.executeScript(js);
		executor.executeScript("a.click();");
		driver.findElement(By.xpath(valMinimumLength)).sendKeys(min);
		driver.findElement(By.xpath(valMaximumLength)).sendKeys(max);
		driver.findElement(By.xpath(afterClickLenConstHeader)).click();
	}

	public void productRegularExpression(String expressionvalue, String errorMsg) {
		driver.findElement(By.xpath(validationButton)).click();
		executor = (JavascriptExecutor) driver;
		String js = "a=$('[class=\\\"mat-menu-item\\\"]')[2];";
		executor.executeScript(js);
		executor.executeScript("a.click();");
		driver.findElement(By.xpath(regularExpressionValue)).sendKeys("text");
		driver.findElement(By.xpath(regularExpressionErrMsg)).sendKeys("text");
		driver.findElement(By.xpath(afterClickRegExpHeader)).click();
	}

	public void productCustomValidation(String customVal, String errMsg) {
		driver.findElement(By.xpath(validationButton)).click();
		executor = (JavascriptExecutor) driver;
		String js = "a=$('[class=\\\"mat-menu-item\\\"]')[3];";
		executor.executeScript(js);
		executor.executeScript("a.click();");
		driver.findElement(By.xpath(customValidation)).sendKeys(customVal);
		driver.findElement(By.xpath(customValidationErrMsg)).sendKeys(errMsg);
		driver.findElement(By.xpath(afterClickCustValHeader)).click();

	}
	public void productBeforeCreateVal() {
		driver.findElement(By.xpath("//element-picker/a/span[contains(text(),'Cancel')]")).click();
		driver.findElement(By.xpath("//element-picker/a/span[contains(text(),' Select Spotlight')]")).click();
	}
	public void productAfterSaveValidationButton() {
		driver.findElement(By.xpath("//span[@class='product-panel-btn back']/span")).click();
	}

	public void productCreateValidation(String elementXpath, String min, String max, String regExp, String reMsg,
			String custAssr, String caMsg) {
		try {
			Assert.assertTrue(driver
					.findElement(By.xpath(
							"//div[@class='form-connected connected']/span[contains(text(),'Connected to form page')]"))
					.isDisplayed());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath(editorNewValidation)).click();
			productBeforeCreateVal();
			driver.findElement(By.xpath(elementXpath)).click();
			productRequiredFieldValidation();
			productLengthConstraint(min, max);
			productRegularExpression(regExp, reMsg);
			productCustomValidation(custAssr, caMsg);
			driver.findElement(By.xpath(validationSave)).click();
			productAfterSaveValidationButton();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// login to productEditor
	public void productEditorLogin(String loginId, String password) {
		try {
		driver.findElement(By.xpath(productEditorButton)).click();
		driver.findElement(By.xpath(editorLogin)).sendKeys(loginId);
		driver.findElement(By.xpath(editorPassword)).sendKeys(password);
		driver.findElement(By.xpath(editorLoginButton)).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	// logout from product Editor
	public void productEditorLogOut() {
		driver.findElement(By.xpath(editorLogOutButton)).click();
	}

	// select workflow to play in
	public void productSelectFlowToPlay(String flowName) {
		List<WebElement> options = driver.findElements(By.xpath(editorWorkFlowList));
		for (WebElement select : options) {
			if (select.getText().equals(flowName)) {
				select.click();
				break;
			}
		}
	}

	public void productSelectBalloonPosition(String position) {
		
		if (position.equalsIgnoreCase("cornerLeftTop")) {
			driver.findElement(By.xpath(cornerLeftTop)).click();
		} else if (position.equalsIgnoreCase("cornerRightTop")) {
			driver.findElement(By.xpath(cornerRightTop)).click();
		} else if (position.equalsIgnoreCase("cornerTopLeft")) {
			driver.findElement(By.xpath(cornerTopLeft)).click();
		} else if (position.equalsIgnoreCase("cornerTopRight")) {
			driver.findElement(By.xpath(cornerTopRight)).click();
		} else if (position.equalsIgnoreCase("left")) {
			driver.findElement(By.xpath(left)).click();
		} else if (position.equalsIgnoreCase("top")) {
			driver.findElement(By.xpath(top)).click();
		} else if (position.equalsIgnoreCase("bottom")) {
			driver.findElement(By.xpath(bottom)).click();
		} else if (position.equalsIgnoreCase("right")) {
			driver.findElement(By.xpath(right)).click();
		} else if (position.equalsIgnoreCase("cornerBottomRight")) {
			driver.findElement(By.xpath(cornerBottomRight)).click();
		} else if (position.equalsIgnoreCase("cornerBottomLeft")) {
			driver.findElement(By.xpath(cornerBottomLeft)).click();
		} else if (position.equalsIgnoreCase("cornerRightBottom")) {
			driver.findElement(By.xpath(cornerRightBottom)).click();
		} else if (position.equalsIgnoreCase("cornerLeftBottom")) {
			driver.findElement(By.xpath(cornerLeftBottom)).click();
		}
		
		

	}

	public void productSelectAdvanceOn(String advanceOn) {
		
		if (advanceOn.equalsIgnoreCase("nextButton")) {
			driver.findElement(By.xpath(nextButton)).click();
		} else if (advanceOn.equalsIgnoreCase("clickOnElement")) {
			driver.findElement(By.xpath(clickOnElement)).click();
		} else if (advanceOn.equalsIgnoreCase("mouseHoverElement")) {
			driver.findElement(By.xpath(mouseHoverElement)).click();
		} else if (advanceOn.equalsIgnoreCase("changeInElement")) {
			driver.findElement(By.xpath(changeInElement)).click();
		} else if (advanceOn.equalsIgnoreCase("inputInElement")) {
			driver.findElement(By.xpath(inputInElement)).click();
		}
		
	}

	public void productWorkflowStepDescription(String desc) {
		driver.findElement(By.xpath(stepDescription)).sendKeys(desc);
	}

	public void productWorkFlowClickNextStep() {
		driver.findElement(By.xpath(workflowNextStep)).click();
	}

	public void productWorkFlowClickDoneButton() {
		driver.findElement(By.xpath(workflowDoneButton)).click();
	}

	public void workflowReselectElement() {
		driver.findElement(By.xpath(reselectElement)).click();
	}

	public void workflowClickOnElement(String xpath) {
		executor.executeScript("$('td input[name=portlet_title]').click();");
	}

	public void workflowMarkEntryPoint(String entryPt, String xPath) {
		try {
		String r=xPath.toLowerCase();
		boolean result = Boolean.parseBoolean(r);
		if (result == true) {
			driver.findElement(By.xpath(markEntryPoint)).click();
			productClickPicker();
			if (driver.findElement(By.xpath("//div/p[text()='Select atleast one anchor for the milestone step']"))
					.isDisplayed() == true)
				driver.findElement(By.xpath(xPath)).click();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void productWorkFlowDetails(String name, String desc) {
		driver.findElement(By.xpath(workFlowName)).sendKeys(name);
		driver.findElement(By.xpath(workFlowDescription)).sendKeys(desc);
	}

	public void productCreateNewFlow() {
		driver.findElement(By.cssSelector(editorCreateNewFlowFormButton)).click();
	}

	public void productSaveFormDesc() {
		driver.findElement(By.xpath("//button[@class='button-save mat-button']")).click();
	}

	public void createNewWorkFlow(String name, String desc) {
		try {
		productCreateNewFlow();
		productWorkFlowDetails(name, desc);
		productSaveFormDesc();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//element-picker/a/span[contains(text(),'Cancel')]")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void createNewWorkFlow(String xpath, String desc, String advanceOn, String position, String entryPt) {
		try {
		driver.findElement(By.xpath("//element-picker/a/span[contains(text(),'Select Element')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).click();
		productWorkflowStepDescription(desc);
		productSelectAdvanceOn(advanceOn);
		productSelectBalloonPosition(position);
		workflowMarkEntryPoint(entryPt, xpath);
		productWorkFlowClickNextStep();
		}
		catch(Exception e) {
		e.printStackTrace();	
		}

	}
	public void backButton() {
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
		executor.executeScript("$('back-btn span span').click();");
	}

}
