package parentTest;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
//import org.junit.Assert;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GooglePage;


import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.*;

//import static org.hamcrest.CoreMatchers.is;

public class ParentTest {

    public WebDriver webDriver;
    public GooglePage googlePage;

    public ParentTest() {

    }

    @Before
    public void setUp() {

        /*
        // заокментировано для работы с Selenide
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // !!!!!!
        googlePage = new GooglePage(webDriver);
        */

        Configuration.fastSetValue = true;  // ускоряет выпонение тестов и ввод данных в поля
        Configuration.browserSize = "1600x1200";
        Configuration.screenshots = true;
        Configuration.savePageSource = true;
        Configuration.reopenBrowserOnFail = true;

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        // 1 - Allow, 2 - block, 3 - default
        prefs.put("profile.default_content_setting_values.notifications",1);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("disable-infobars");
        options.addArguments("--window-sixe-1600,1200");
        WebDriverRunner.setWebDriver(new ChromeDriver(options));



        googlePage = new GooglePage(webDriver);

    }

    @After
    public void shutDown() {

        //webDriver.quit(); // закрыть браузер  // закоментарен после включения Selenid
        //webDriver.close(); // закрыть вкладку

        // для работы через Selenid используем все строки ниже
        WebDriver currentDriver = getWebDriver();
        currentDriver.manage().deleteAllCookies();
        currentDriver.quit();

    }

    /*public void checkActualResultWithExpectedResult(String message, boolean actualResult, boolean expectedResult) {
        Assert.assertThat(message, actualResult, is(expectedResult));
    }*/

}
