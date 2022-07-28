package pages;

import libs.WebElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;

public class ParentPage {

    WebDriver webDriver;
    Logger logger;
    WebElements webElements;


    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webElements = new WebElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }

     /*
     * Method opens url
     * @param
     * */
    public void open(String url) {
        try {
            webDriver.get(url);
            logger.info("Page has been opened" + url);
        } catch (Exception e) {
            logger.error("Page has not been opened" + url);
            Assert.fail("Page has not been opened" + url);
        }
    }


}
