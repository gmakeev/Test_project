package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends ParentPage{

    /*@FindBy(xpath = "//img[@class='lnXdpd' and @alt='Google']")
    private WebElement viewPageGoogle;*/

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputText;

    @FindBy(xpath = "//div[@jsname='VlcLAe']/center[1]/input[1]")
    private WebElement buttonSubmit;

    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openGooglePage() {
        open("https://google.com");
        //webDriver.findElement(By.xpath(String.valueOf(inputText)));
    }

    public boolean isIconGooglePresent(String text) {
        return webElements.isElementPresent(".//input[@type='text']");
    }
    public void enterTextForGooglePage(String text) {
        webElements.enterText(inputText, text);
    }

    public void clickOnSubmit() {
        webElements.clickOnElement(buttonSubmit);
    }

}
