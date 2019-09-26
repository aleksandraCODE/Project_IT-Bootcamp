package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	public static final String URL = "tkb1.humanity.com/app/staff/detail/5093317/";
	private static final String PROFILE_ICON = "//img[@id='tr_avatar']";
	private static final String PROFILE = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String VERSION_APP = "//div[@id='humanityAppVersion']";
	private static final String ARROW = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";

//Profile Icon
	public static WebElement getProfileIcon(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_ICON));
	}

	public static void clickProfileIcon(WebDriver driver) {
		getProfileIcon(driver).click();
	}

	// Profile
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE));
	}

	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}

	// Settings
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS));
	}

	public static void clickSettings(WebDriver driver) {
		getProfile(driver).click();
	}

	// Availability
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY));
	}

	public static void clickAvailability(WebDriver driver) {
		getProfile(driver).click();
	}

	// VersionApp
	public static WebElement getVersionApp(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY));
	}

//ARROW
	public static WebElement getArrow(WebDriver driver) {
		return driver.findElement(By.xpath(ARROW));
	}

	public static void clickArrow(WebDriver driver) {
		getProfile(driver).click();
	}
}