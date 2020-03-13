package pages;

import common.GlobalFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CampaignPage extends GlobalFunctions {
    private WebDriver webDriver;

    public CampaignPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private String campaignImage = "#campaign-page > div";
    private String campaignTitle = "#campaign-info__title";
    private String donasiSekarangButton = "#campaign-detail_button_donasi-sekarang";

    public void checkCampaignPage() {
        webDriver.findElement(By.cssSelector(campaignImage)).isDisplayed();
        webDriver.findElement(By.cssSelector(campaignTitle)).isDisplayed();
        webDriver.findElement(By.cssSelector(donasiSekarangButton)).isDisplayed();
    }
    public void clickDonasiSekarang() {
        scrollDown(webDriver);
        webDriver.findElement(By.cssSelector(donasiSekarangButton)).click();
    }
}
