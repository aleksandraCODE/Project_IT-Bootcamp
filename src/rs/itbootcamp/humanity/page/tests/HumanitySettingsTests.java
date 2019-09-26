package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTests {
	public static boolean test_Humanity_Settings() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		HumanityHome.getLogInButton(driver);
		HumanityHome.clickLogInButton(driver);
		HumanityHome.getEmailUser(driver);
		HumanityHome.clickEmailUser(driver);

		HumanityHome.enterEmailUser(driver, "xokas@247web.net");
		HumanityHome.getPassField(driver);

		HumanityHome.enterPassField(driver, "santoro123");
		HumanityHome.clicklogInBtn(driver);
		Thread.sleep(5000);

		HumanitySettings.getSettingsBtn(driver);
		HumanitySettings.clickSettingsBtn(driver);
		Thread.sleep(3000);
		HumanitySettings.inputCountry(driver, "Sweden");
		Thread.sleep(3000);
		HumanitySettings.inputLanguage(driver, "Swedish (machine)");
		Thread.sleep(3000);
		HumanitySettings.inputTimeFormat(driver, "24 hour");
		Thread.sleep(5000);
		driver.quit();
		return true;
	}
}