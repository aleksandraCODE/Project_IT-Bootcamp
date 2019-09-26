package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL = "https://tkb1.humanity.com/app/staff/detail/5093317/";
	private static final String EDIT_DETAILS = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PICTURE = "//input[@id='fileupload']";
	private static final String SAVE_EMPLOYEE = "//button[@id='act_primary']";
	private static final String NICKNAME = "//input[@id='nick_name']";
	private static final String PHOTO_PATH="C:/Users/Anna/Desktop/Slika.jpg"; 

	// Edit Profile
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS));
	}

	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}

	// Save employee
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE));
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
	public static void clickUploadPhotoBtn(WebDriver driver) {
		getNickName(driver).click();
	}

	public static void inputUploadPhoto(WebDriver driver) {
		getUploadPhotoBtn(driver).sendKeys(PHOTO_PATH);

	}
}
