package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverBuilder {
    private WebDriver webDriver;

    @Before
    public void setDriver() {
        WebDriverManager.chromedriver().version("80.0.3987.106").setup();
        webDriver = new ChromeDriver();
        openKumparan();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @After
    public void tearDown() {
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }

    public void openKumparan() {
        webDriver.get("https://kitabisa.com/");
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}

