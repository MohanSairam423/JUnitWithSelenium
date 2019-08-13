package environment;

import org.openqa.selenium.WebDriver;

public class Runenvironment {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver1) {
		driver = driver1;
	}
	
}
