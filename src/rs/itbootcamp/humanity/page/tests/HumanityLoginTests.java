package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import utility.ExcelUtils;

public class HumanityLoginTests {

	public static boolean testHumanityLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// HumanityHome.getLogInButton(driver);
		HumanityHome.clickLogInButton(driver);
		// HumanityHome.getEmailUser(driver);
		// HumanityHome.clickEmailUser(driver);

		// HumanityHome.enterEmailUser(driver, "xokas@247web.net");
		// HumanityHome.getPassField(driver);

		// HumanityHome.enterPassField(driver, "santoro123");
		// HumanityHome.clicklogInbtn(driver);

		Thread.sleep(2000);
		ExcelUtils.setExcell("Data.xls");
		ExcelUtils.setWorkSheet(0);

		String mail = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);

		HumanityHome.enterEmailUser(driver, mail);
		HumanityHome.enterPassField(driver, password);

		HumanityHome.clicklogInBtn(driver);

		ExcelUtils.closeExcell();

		Thread.sleep(2000);
		driver.quit();

		return true;

	}
}
