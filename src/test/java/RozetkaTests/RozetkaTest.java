package RozetkaTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class RozetkaTest {

    WebDriver webDriver;

    @Test
    public void googleTest() {
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // !!!!!!

        webDriver.get("https://rozetka.com.ua/");


        //webDriver.findElement(By.xpath(".//input[@name=\"search\"]"));
        //webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-main-page[1]/div[1]/main[1]"));
        webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ноутбуки");


        webDriver.quit(); // закрыть браузер
        //webDriver.close(); // закрыть вкладку
    }
}
