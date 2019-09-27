package rs.itbootcamp.humanity.page.start;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaffTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;
import utility.ExcelUtils;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner sc = new Scanner(System.in);

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		String URL = "https://www.humanity.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Welcome to testing website Humanity using Selenium WebDriver");
		int choice;
		System.out.println("Perform one of the offered actions on website Humanity");
		System.out.println();
		System.out.println("You need to type 1 before every next step, because you need to be logged in");
		do {
			System.out.println("0-Exit from the application");
			System.out.println("1-If you want to check log in and adding new employee, type 1");

			System.out
					.println("2-If you want to check setting state, time format and language on the  website, type 2");
			System.out.println(
					"3-If you want data to be loaded from the Excel file for log in and adding new employee, type 3 ");
			System.out.println("4-For uploading picture for employee and also setting nickname, type 4");
			System.out.println("5-To see current version of Humanity application, type 5");
			choice = sc.nextInt();
			switch (choice) {
			case 1:

				driver.get(HumanityHome.URL);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				driver.manage().window().maximize();

				HumanityHome.clickLogInButton(driver);

				HumanityHome.clickEmailUser(driver);

				HumanityHome.enterEmailUser(driver, "xokas@247web.net");

				HumanityHome.enterPassField(driver, "santoro123");
				HumanityHome.clicklogInBtn(driver);
				HumanityMenu.clickStaff(driver);
				Thread.sleep(5000);
				HumanityStaff.clickAddStuffButton(driver);
				Thread.sleep(3000);
				for (int i = 1; i <= 1; i++) {
					HumanityStaff.setFirstNameInput(driver, "Ana", i);
					HumanityStaff.setLastNameInput(driver, "Radojicic", i);
					HumanityStaff.setEmailInput(driver, "anchish5@gmail.com", i);
				}
				HumanityStaff.clickSaveEmployeesButton(driver);
				Thread.sleep(5000);
				HumanityMenu.clickDashBoardButton(driver);

				break;

			case 2:

				HumanitySettings.getSettingsBtn(driver);
				HumanitySettings.clickSettingsBtn(driver);
				Thread.sleep(3000);
				HumanitySettings.inputCountry(driver, "Sweden");
				Thread.sleep(3000);
				HumanitySettings.inputLanguage(driver, "Swedish (machine)");
				Thread.sleep(3000);
				HumanitySettings.inputTimeFormat(driver, "24 hour");
				Thread.sleep(5000);
				HumanityMenu.clickDashBoardButton(driver);
				break;
			case 3:
				// POI

				HumanityMenu.clickStaff(driver);
				Thread.sleep(5000);

				HumanityStaff.clickAddStuffButton(driver);
				Thread.sleep(3000);
				ExcelUtils.setExcell("Data.xls");
				ExcelUtils.setWorkSheet(1);
				int brRedova = ExcelUtils.getRowNumber();
				for (int i = 1; i < brRedova; i++) {
					String firstName = ExcelUtils.getDataAt(i, 0);
					String lastName = ExcelUtils.getDataAt(i, 1);
					String email = ExcelUtils.getDataAt(i, 2);
					HumanityStaff.setFirstNameInput(driver, firstName, i);
					HumanityStaff.setLastNameInput(driver, lastName, i);
					HumanityStaff.setEmailInput(driver, email, i);
					Thread.sleep(3000);

				}
				HumanityStaff.clickSaveEmployeesButton(driver);
				HumanityMenu.clickDashBoardButton(driver);

				break;
			case 4:

				HumanityProfile.clickProfileIcon(driver);
				Thread.sleep(5000);

				HumanityProfile.clickProfile(driver);

				Thread.sleep(5000);

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
				HumanityMenu.clickDashBoardButton(driver);
				break;
			case 5:

				HumanityProfile.clickProfileIcon(driver);
				Thread.sleep(5000);
				HumanityProfile.printVersion(driver);

				break;

			default:
				System.out.println("Wrong input, you can enter only number from 0 - 5");
			case 0:
				System.out.println("Exit from application!");

				System.out.println("Thank you for attention. Testing is over.");
				System.out.println("Have a nice day!");
				driver.quit();
				break;
			}

		} while (choice != 0);
		Thread.sleep(5000);
		driver.quit();
	}
}