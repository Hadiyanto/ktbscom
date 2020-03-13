package pages;

import common.GlobalFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DonationAmounPage extends GlobalFunctions {
    private WebDriver webDriver;

    public DonationAmounPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    private String nominalAmountTitle = "#donation-amount p";
    private String amount10K = "[class*='style__DonationAmountOption']:nth-child(2)";
    private String amount20K = "[class*='style__DonationAmountOption']:nth-child(3)";
    private String amount50K = "[class*='style__DonationAmountOption']:nth-child(4)";
    private String amount100K = "[class*='style__DonationAmountOption']:nth-child(5)";
    private String nominalLainnya = "[class*='style__DonationAmountOption']:nth-child(6)";
    private String lanjutkanPembayaranButton = "#contribute_button_lanjutkan-pembayaran";

    public void checkDonationAmountPage() {
        webDriver.findElement(By.cssSelector(nominalAmountTitle)).isDisplayed();
        webDriver.findElement(By.cssSelector(amount10K)).isDisplayed();
        webDriver.findElement(By.cssSelector(amount20K)).isDisplayed();
        webDriver.findElement(By.cssSelector(amount50K)).isDisplayed();
        webDriver.findElement(By.cssSelector(amount100K)).isDisplayed();
        webDriver.findElement(By.cssSelector(nominalLainnya)).isDisplayed();
        webDriver.findElement(By.cssSelector(lanjutkanPembayaranButton)).isDisplayed();
    }

    public void clickAmount10K() {
        webDriver.findElement(By.cssSelector(amount10K)).click();
    }

    public void clickLanjutkanPembayaranButton() {
        webDriver.findElement(By.cssSelector(lanjutkanPembayaranButton)).click();
    }
}
