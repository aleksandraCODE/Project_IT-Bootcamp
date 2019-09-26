package rs.itbootcamp.humanity.page.start;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaffTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to testing website Humanity");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose number :");
			System.out.println("1 - Log in to website");
			System.out.println("2 - Check the settings");
			System.out.println("3 - Edit Staff");
			System.out.println("4 - Add New Employee");
			int br = sc.nextInt();
			boolean result = false;
			switch (br) {

			case 1: {

				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				result = HumanityLoginTests.testHumanityLogin();
				driver.quit();
				break;
			}
			case 2:

				result = HumanitySettingsTests.test_Humanity_Settings();
				break;

			case 3:
				result = HumanityEditStaffTests.test_HumanityEditStaff();
				break;

			case 4:
				result = HumanityAddNewEmployeeTests.testHumanityAddNewEmployee();
				break;

			}

			if (result == true)

			{
				System.out.println("Test je uspesan");
			} else {
				System.out.println("Test nije uspeo");
			}

			sc.close();

		} catch (

		Exception e) {
			System.out.println("neuspesno catch: " + e.getMessage());
		}
	}
}

//HumanityLoginTests.testHumanityLogin();
// HumanityAddNewEmployeeTests.testHumanityAddNewEmployee();
// HumanityEditStaffTests.test_HumanityEditStaff();
// HumanitySettingsTests.test_Humanity_Settings();