package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityEditStaffTests {
	public static boolean test_HumanityEditStaff() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//log in
		HumanityHome.getLogInButton(driver);
		HumanityHome.clickLogInButton(driver);
		HumanityHome.getEmailUser(driver);
		HumanityHome.clickEmailUser(driver);

		HumanityHome.enterEmailUser(driver, "xokas@247web.net");
		HumanityHome.getPassField(driver);

		HumanityHome.enterPassField(driver, "santoro123");
		HumanityHome.clicklogInBtn(driver);
		Thread.sleep(5000);
		HumanityProfile.getProfileIcon(driver);
		HumanityProfile.clickProfileIcon(driver);
		Thread.sleep(5000);
		HumanityProfile.getProfile(driver);
		HumanityProfile.clickProfile(driver);

		Thread.sleep(5000);
		HumanityEditStaff.getEditDetails(driver);
		HumanityEditStaff.clickEditDetails(driver);
		Thread.sleep(5000);
		// upload photo
		HumanityEditStaff.getUploadPhotoBtn(driver);
		HumanityEditStaff.inputUploadPhoto(driver);
		Thread.sleep(5000);
		// set nickname
		HumanityEditStaff.inputNickName(driver, "Anchi");
		// save employee
		HumanityEditStaff.clickSaveEmployee(driver);

		driver.quit();
		return true;
	}
}
