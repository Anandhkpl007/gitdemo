package Com.adacitin_baaseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browser(String anybrowser) {
		if (anybrowser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} else if (anybrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		return driver;

	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void input(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);

		}

	}

	public static void action(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();

	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void Screenshot() throws IOException {
		TakesScreenshot scr =  (TakesScreenshot) driver;
		File from = scr.getScreenshotAs(OutputType.FILE);
		File to = new File("E:\\java class and selenium\\adactin\\Screenshot\\screenshot.png");
		FileUtils.copyFile(from, to);
	}

}
