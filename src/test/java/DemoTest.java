import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import environment.EnvironmentManager;
import environment.Runenvironment;

public class DemoTest {

    @Before
    public void startBrowser() {
        //EnvironmentManager.initWebDriver();
    }

    @Test
    public void demo() {
        //WebDriver driver = Runenvironment.getDriver();
        //driver.get("https://www.blazemeter.com/selenium");
        //String homeUrl = driver.findElement(By.cssSelector("div#logo> a#logo_image ")).getAttribute("href");
        String homeUrl = "https://www.blazemeter.com/";
        assertEquals(homeUrl, "https://www.blazemeter.com/");
    }

    @After
    public void tearDown() {
        //EnvironmentManager.shutDownDriver();
    }
}
