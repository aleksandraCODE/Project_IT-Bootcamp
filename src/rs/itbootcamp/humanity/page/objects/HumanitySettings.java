package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	public static final String URL="https://tkb1.humanity.com/app/admin/settings/";
	private static final String SETTINGS_BUTTON="//i[@class='primNavQtip__icon icon-gear']";
	private static final String SELECT_COUNTRY = "//select[@id='country']";
	private static final String SELECT_TIME_FORMAT = "//select[@name='pref_24hr']";
	private static final String SELECT_LANGUAGE = "//td[@class='nowrap']//select[@name='language']";
//SETTINGS BUTTON
	public static WebElement getSettingsBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON));
	}

	public static void clickSettingsBtn(WebDriver driver) {
		getSettingsBtn(driver).click();
	}
//SELECT COUNTRY

	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY)));

	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}

	// SELECT DEFAULT LANGUAGE
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_LANGUAGE)));

	}

	public static void inputLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}

	// SELECT TIME FORMAT
	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_TIME_FORMAT)));

	}

	public static void inputTimeFormat(WebDriver driver, String data) {
		getTimeFormat(driver).selectByVisibleText(data);

	}
}
