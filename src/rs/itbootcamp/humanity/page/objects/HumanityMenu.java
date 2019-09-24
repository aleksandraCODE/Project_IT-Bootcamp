package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String URL = "https://tkb1.humanity.com/app/dashboard/";
	//private static final String DASHBOARD = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String DASHBOARD ="//p[contains(text(),'Dashboard')]";
	private static final String SHIFT_PLANNING = "//p[contains(text(),'ShiftPlanning')]";
	private static final String TIME_CLOCK = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE = "//p[@class='primNavQtip__itemName'][contains(text(),'Leave')]";
	private static final String TRAINING = "//p[contains(text(),'Training')]";
	//private static final String STAFF = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String STAFF ="//p[contains(text(),'Staff')]";
	private static final String PAYROLL = "//p[contains(text(),'Payroll')]";
	private static final String REPORTS = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	private static final String SIGN_OUT = "//a[contains(text(),'Sign Out')]";
	private static final String SETTINGS_BUTTON="//i[@class='primNavQtip__icon icon-gear']";

	// DASHBOARD
	public static WebElement getDashBoardButton(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD));
	}

	public static void clickDashBoardButton(WebDriver driver) {
		getDashBoardButton(driver).click();
	}

	// SHIFTPLANNING
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING));
	}

	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();

	}

	// TIME CLOCK
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK));
	}

	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}

	// LEAVE
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// TRAINING
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// STAFF
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();

	}

	// PAYROLL
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// REPORTS
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}
//SIGNOUT
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT));
	}

	public static void clickSignOut(WebDriver driver) {
				getSignOut(driver).click();
			
}
	//Settings Button
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	
}
}