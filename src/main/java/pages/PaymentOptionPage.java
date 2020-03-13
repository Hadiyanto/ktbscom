package pages;

import common.GlobalFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentOptionPage extends GlobalFunctions {
    private WebDriver webDriver;

    public PaymentOptionPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private String gopay = "//span[.=\"GO-PAY\"]";
    private String jeniusPay = "//span[.=\"Jenius Pay\"]";
    private String linkAja = "//span[.=\"LinkAja\"]";
    private String dana = "//span[.=\"DANA\"]";
    private String transferBCA = "//span[.=\"Transfer BCA\"]";

    public void checkPaymentOptionPage() {
        webDriver.findElement(By.xpath(gopay)).isDisplayed();
        webDriver.findElement(By.xpath(jeniusPay)).isDisplayed();
        webDriver.findElement(By.xpath(linkAja)).isDisplayed();
        webDriver.findElement(By.xpath(dana)).isDisplayed();
        scrollUp(webDriver);
        webDriver.findElement(By.xpath(transferBCA)).isDisplayed();
    }

    public void clickTransferBCA() {
        webDriver.findElement(By.xpath(transferBCA)).click();
    }
}
