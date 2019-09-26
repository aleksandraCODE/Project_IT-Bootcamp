package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com/";
	private static final String ABOUT_US_BUTTON = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGIN_BUTTON = "//p[contains(text(),'LOGIN')]";
	private static final String FREE_TRIAL_BUTTON = "//a[@class='button pale']";
	private static final String FULL_NAME = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String FREE_TRIAL_BUTTON2 = "//input[@id='free-trial-link-01']";
	private static final String LOGIN_USERNAME = "//input[@id='email']";
	private static final String USEREMAIL_XPATH = "//input[@id='email']";
	private static final String PASSWORD_XPATH = "//input[@id='password']";
	private static final String CONFIRMLOGIN_XPATH = "//button[contains(text(),'Log in')]";

	// About us
	public static WebElement getAboutUSButton(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_BUTTON));
	}

	public static void clickAboutUS(WebDriver driver) {
		getAboutUSButton(driver).click();
	}

//Free Trial button gore
	public static WebElement getFreeTrialButton(WebDriver driver) {
		return driver.findElement(By.xpath(FREE_TRIAL_BUTTON));
	}

	public static void clickFreeTrialButton(WebDriver driver) {
		getFreeTrialButton(driver).click();

	}

//Full name
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME));
	}

	public static void clickgetFullName(WebDriver driver) {
		getFullName(driver).click();
	}

	public static void enterFullName(WebDriver driver, String data) {
		getFullName(driver).sendKeys(data);
	}

//Work email
	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL));
	}

	public static void clickWorkEmail(WebDriver driver) {
		getWorkEmail(driver).click();
	}

	public static void enterWorkEmail(WebDriver driver, String data) {
		getWorkEmail(driver).sendKeys(data);
	}

	// Free Trial button dole
	public static WebElement getFreeTrialButton2(WebDriver driver) {
		return driver.findElement(By.xpath(FREE_TRIAL_BUTTON2));
	}

	public static void clickFreeTrialButton2(WebDriver driver) {
		getWorkEmail(driver).click();

	}

	// LogIn button
	public static WebElement getLogInButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON));
	}

	public static void clickLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

	// Email user name
	public static WebElement getEmailUser(WebDriver driver) {
		return driver.findElement(By.xpath(USEREMAIL_XPATH));
	}

	public static void clickEmailUser(WebDriver driver) {
		getEmailUser(driver).click();
	}

	public static void enterEmailUser(WebDriver driver, String data) {
		getEmailUser(driver).sendKeys(data);
	}

	// Password field
	public static WebElement getPassField(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPassField(WebDriver driver) {
		getPassField(driver).click();
	}

	public static void enterPassField(WebDriver driver, String data) {
		getPassField(driver).sendKeys(data);
	}

	// Confirm Log In
	public static WebElement getlogInBtn(WebDriver driver) {
		return driver.findElement(By.xpath(CONFIRMLOGIN_XPATH));
	}

	public static void clicklogInBtn(WebDriver driver) {
		getlogInBtn(driver).click();
	}
}