package rs.itbootcamp.humanity.page.start;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;

public class Main {

	
		public static void main(String[] args) throws InterruptedException {
			
			//	HumanityLoginTests.testHumanityLogin();
				HumanityAddNewEmployeeTests.testHumanityAddNewEmployee();
					

			}

		}
