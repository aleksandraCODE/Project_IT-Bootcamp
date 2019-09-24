package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL = "https://tkb1.humanity.com/app/staff/detail/5093317/";
	private static final String EDIT_PROFILE = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PICTURE = "//input[@id='fileupload']";
	private static final String SAVE_EMPLOYEE = "//button[@id='act_primary']";
	private static final String NICKNAME = "//input[@id='nick_name']";

	// Edit Profile
	public static WebElement getEditProfile(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_PROFILE));
	}

	public static void clickEditProfile(WebDriver driver) {
		getEditProfile(driver).click();
	}

	// Save employee
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_PROFILE));
	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();

	}

	// Nickname
	public static WebElement getNickName(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME));
	}

	public static void clickNickName(WebDriver driver) {
		getNickName(driver).click();
	}
	public static void inputNickName(WebDriver driver, String data) {
		getNickName(driver).sendKeys(data);

	}

	// Upload picture
	public static WebElement getUploadPhotoBtn(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PICTURE));
	}

}
