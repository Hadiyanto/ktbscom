package pages;

import common.GlobalFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends GlobalFunctions {
    private   WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver=webDriver;
    }

    private String logo = "#defaultheader_logo";
    private String searchField = "#defaultheader_search";
    private String galangDanaSekarangButton = "#home_button_galang-dana";
    private String firstCampaign = "#scroller > div > div > div:nth-child(2) > a";

    public void checkHomepage() {
        webDriver.findElement(By.cssSelector(logo)).isDisplayed();
        webDriver.findElement(By.cssSelector(searchField)).isDisplayed();
        webDriver.findElement(By.cssSelector(galangDanaSekarangButton)).isDisplayed();
    }
    public void clickFirstCampaign() {
        scrollDown(webDriver);
        webDriver.findElement(By.cssSelector(firstCampaign)).click();
    }


}

