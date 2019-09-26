package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	public static final String URL = "https://tkb1.humanity.com/app/staff/list/load/true/";
	private static final String EMPLOYEE_2 = "//div[@id='_cd_staff']//tr[2]";
	private static final String EMPLOYEE_3 = "//div[@id='_cd_staff']//tr[3]";
	private static final String EMPLOYEE_4 = "//div[@id='_cd_staff']//tr[4]";
	private static final String ADD_STAFF_BUTTON = "//button[@id='act_primary']";
	private static final String EMAIL_XPATH = "//input[@id='_ase";
	private static final String FIRST_NAME = "//input[@id='_asf";
	private static final String LAST_NAME = "//input[@id='_asl";
	private static final String INPUT_ENDING_XPATH = "']";
	private static final String SAVE_EMPLOYEES = "//button[@id='_as_save_multiple']";

	// Employee 2
	public static WebElement getEmployee2(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_2));
	}

	public static void clickEmployee2(WebDriver driver) {
		getEmployee2(driver).click();
	}

	// Employee 3
	public static WebElement getEmployee3(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_3));
	}

	public static void clickEmployee3(WebDriver driver) {
		getEmployee3(driver).click();
	}

	// Employee 4
	public static WebElement getEmployee4(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_4));
	}

	public static void clickEmployee4(WebDriver driver) {
		getEmployee4(driver).click();
	}

	// ADD_STUFF_BUTTON
	public static WebElement getAddStuffButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_STAFF_BUTTON));
	}

	public static void clickAddStuffButton(WebDriver driver) {
		getAddStuffButton(driver).click();
	}

	// ADD New Employee
	// First name employee
	public static WebElement getFirstNameInput(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(FIRST_NAME + poRedu + INPUT_ENDING_XPATH));
	}

	public static void setFirstNameInput(WebDriver driver, String name, int poRedu) {
		getFirstNameInput(driver, poRedu).sendKeys(name);

	}

	// Last name employee
	public static WebElement getLastNameInput(WebDriver driver, int redBr) {
		return driver.findElement(By.xpath(LAST_NAME + redBr + INPUT_ENDING_XPATH));
	}

	public static void setLastNameInput(WebDriver driver, String name, int redBr) {
		getLastNameInput(driver, redBr).sendKeys(name);
	}

	// Email employee
	public static WebElement getEmailInput(WebDriver driver, int redBr) {
		return driver.findElement(By.xpath(EMAIL_XPATH + redBr + INPUT_ENDING_XPATH));
	}

	public static void setEmailInput(WebDriver driver, String name, int redBr) {
		getEmailInput(driver, redBr).sendKeys(name);
	}

	// Save employees button
	public static WebElement getSaveEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES));
	}

	public static void clickSaveEmployeesButton(WebDriver driver) {
		getSaveEmployeesButton(driver).click();

	}
}
