package environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentManager {

	public static void initWebDriver() {
	    System.setProperty("webdriver.chrome.driver", "/Users/mohansaira.medisetti/Downloads/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    Runenvironment.setDriver(driver);
	}
	
	public static void shutDownDriver() {
	    Runenvironment.getDriver().quit();
	}
}
