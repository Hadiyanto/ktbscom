package pages;

import common.GlobalFunctions;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContributePage extends GlobalFunctions {
    private WebDriver webDriver;

    public ContributePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private String nominalDonasiField = "#contribute_inputfield_amount-donation";
    private String paymentContainer = "[class*=\"style__PaymentContainer\"]";
    private String gantiPembayaranButton = "#contribute_button_pilih-metode-pembayaran";
    private String namaLengkapField = "input[name=\"fullname\"]";
    private String whatsappAtauEmailField = "input[name=\"username\"]";
    private String lanjutkanPembayaranButton = "#contribute_button_lanjutkan-pembayaran";

    public void checkContributePage() {
        webDriver.findElement(By.cssSelector(nominalDonasiField)).isDisplayed();
        webDriver.findElement(By.cssSelector(paymentContainer)).isDisplayed();
        webDriver.findElement(By.cssSelector(gantiPembayaranButton)).isDisplayed();
        webDriver.findElement(By.cssSelector(namaLengkapField)).isDisplayed();
        webDriver.findElement(By.cssSelector(whatsappAtauEmailField)).isDisplayed();
        webDriver.findElement(By.cssSelector(lanjutkanPembayaranButton)).isDisplayed();
    }

    public void inputNamaLengkap(String fullname) {
        webDriver.findElement(By.cssSelector(namaLengkapField)).sendKeys(fullname);
    }

    public void inputWhatsappEmail(String username) {
        webDriver.findElement(By.cssSelector(whatsappAtauEmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(3).toUpperCase() + username);
    }

    public void clickLanjutPembayaran() {
        webDriver.findElement(By.cssSelector(lanjutkanPembayaranButton)).click();
    }



}
