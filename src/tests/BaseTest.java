package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


    public class BaseTest {

        WebDriver driver;

   @Before
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("Browser " + options.getBrowserName() + " has been started!");
    }

    @After
    public void teardown() {
        ChromeOptions options = new ChromeOptions();
        driver.quit();
        System.out.println("Browser " + options.getBrowserName() + " has been closed!");
    }
}
