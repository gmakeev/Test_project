package GoogleTests;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parentTest.ParentTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
/*
// эти строки убраны в файл пакета ParentTest для использования Page Object Pattern
// без использования Page Object Pattern они нужны здесь
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;
*/

public class GoogleTest extends ParentTest {

    WebDriver webDriver;

    @Test
    public void googleTest() {
        /*
        // эти строки убраны в файл пакета ParentTest для использования Page Object Pattern
        // без использования Page Object Pattern они нужны здесь
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // !!!!!!
        */

        /*
        // эти строки убраны т.к. мы началаи использовать наслеование от ParentPage
        webDriver.get("https://google.com");
        webDriver.findElement(By.xpath(".//img[@class='lnXdpd' and @alt='Google']"));
        webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("maven selenium java");
        webDriver.findElement(By.xpath("//div[@jsname='VlcLAe']/center[1]/input[1]")).click();
        //webDriver.findElement(By.xpath(" ")).click();

        System.out.println("Page has been opened.");*/

        // с использованием наслеования от ParentPage
        googlePage.openGooglePage();
        googlePage.enterTextForGooglePage("maven selenium java");
        googlePage.clickOnSubmit();


        /*
        // эти строки убраны в файл пакета ParentTest для использования Page Object Pattern
        // без использования Page Object Pattern они нужны здесь
        webDriver.quit(); // закрыть браузер
        //webDriver.close(); // закрыть вкладку*/
    }

    @Test
    public void googleTestWithSelenide() {
        open("https://google.com");
        $(By.xpath(".//img[@alt='Google']")).shouldHave(Condition.visible);
        $(By.xpath(".//input[@type='text']")).setValue("maven selenium java");
        $(By.xpath(".//div[@jsname='VlcLAe']/center[1]/input[1]\"")).click();

    }


}
