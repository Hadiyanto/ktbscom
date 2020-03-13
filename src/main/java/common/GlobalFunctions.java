package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GlobalFunctions {

    protected void scrollDown(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("document.querySelector('body').scrollTop-=1400;");
    }

    protected void scrollUp(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("document.querySelector('body').scrollDown-=1400;");
    }

    protected void timeout(int timeoutInSecond){
        try {
            Thread.sleep(timeoutInSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
