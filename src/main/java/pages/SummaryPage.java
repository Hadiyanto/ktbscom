package pages;

import common.GlobalFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SummaryPage extends GlobalFunctions {
    private WebDriver webDriver;

    public SummaryPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private String bannerContainer = "[class*=\"style__BannerContainer\"]";
    private String closeBannerButton = "[class*=\"style__BannerCloseIcon\"]";
    private String summaryTitle = "[class*=\"style__Title\"]";
    private String donationAmount = "[class*=\"style__DonationAmount\"]";
    private String detailsAmount = "[class*=\"style__DetailAmountBox\"]";
    private String kembaliKePenggalanganButton = "span[class*=\"style__TextSpan\"]";

    public void checkBannerContainer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.cssSelector(bannerContainer)).isDisplayed();
        webDriver.findElement(By.cssSelector(closeBannerButton)).isDisplayed();
    }

    public void checkSummaryPage() {
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        webDriver.findElement(By.cssSelector(summaryTitle)).isDisplayed();
        webDriver.findElement(By.cssSelector(donationAmount)).isDisplayed();
        webDriver.findElement(By.cssSelector(detailsAmount)).isDisplayed();
    }

    public void clickCloseBanner() {
        if (webDriver.findElement(By.cssSelector(closeBannerButton)).isDisplayed()) {
            webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            webDriver.findElement(By.cssSelector(closeBannerButton)).click();
        }
    }

    public void clickKembaliKePenggalanganButton() {
        scrollUp(webDriver);
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        webDriver.findElement(By.cssSelector(kembaliKePenggalanganButton)).click();
    }
}
