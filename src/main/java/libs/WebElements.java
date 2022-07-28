package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements {

    WebDriver webDriver;
    Logger logger;

    public WebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    public void enterText(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info(text + " has been inserted");
        } catch (Exception e) {
            logger.error("It can't work with element" + element);
            Assert.fail("It can't work with element" + element);
        }
    }

    public void clickOnElement(WebElement element) {
        try {
            element.click();
            logger.info("Element has been clicked");
        } catch (Exception e) {
            logger.error("Element has NOT been clicked" + element);
            Assert.fail("Element has NOT been clicked" + element);
        }
    }

    public boolean isElementPresent(String locator) {
        try {
            return webDriver.findElement(By.xpath(locator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }



}
