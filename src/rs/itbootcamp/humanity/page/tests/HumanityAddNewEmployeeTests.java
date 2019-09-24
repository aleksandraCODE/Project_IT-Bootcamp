package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;


public class HumanityAddNewEmployeeTests {
	public static boolean testHumanityAddNewEmployee () throws InterruptedException {
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
		HumanityHome.clicklogInbtn(driver);
		Thread.sleep(2000);
		HumanityMenu.getStaff(driver);
		HumanityMenu.clickStaff(driver);
		
		HumanityStaff.getAddStuffButton(driver);
		HumanityStaff.clickAddStuffButton(driver);
		Thread.sleep(2000);
		for (int i=1; i<=1; i++) {
		HumanityStaff.setFirstNameInput(driver, "Ana", i);
		HumanityStaff.setLastNameInput(driver,"Radojicic", i);
		HumanityStaff.setEmailInput(driver,"anchish5@gmail.com",i);
	}
		Thread.sleep(3000);
		return true;
}
}
