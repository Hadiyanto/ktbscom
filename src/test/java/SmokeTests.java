import common.DriverBuilder;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;

public class SmokeTests extends DriverBuilder {

    @Test
    public void donationWithTransferBCA(){
        HomePage homepage = new HomePage(getWebDriver());
        homepage.checkHomepage();
        homepage.clickFirstCampaign();
        CampaignPage campaignpage = new CampaignPage(getWebDriver());
        campaignpage.checkCampaignPage();
        campaignpage.clickDonasiSekarang();
        DonationAmounPage donationAmounPage = new DonationAmounPage(getWebDriver());
        donationAmounPage.checkDonationAmountPage();
        donationAmounPage.clickAmount10K();
        PaymentOptionPage paymentOptionPage = new PaymentOptionPage(getWebDriver());
        paymentOptionPage.checkPaymentOptionPage();
        paymentOptionPage.clickTransferBCA();
        ContributePage contributePage = new ContributePage(getWebDriver());
        contributePage.checkContributePage();
        contributePage.inputNamaLengkap("testfullname");
        contributePage.inputWhatsappEmail("test@mail.com");
        contributePage.clickLanjutPembayaran();
        SummaryPage summaryPage = new SummaryPage(getWebDriver());
        summaryPage.checkBannerContainer();
        summaryPage.clickCloseBanner();
        summaryPage.checkSummaryPage();
        summaryPage.clickKembaliKePenggalanganButton();
    }
}
