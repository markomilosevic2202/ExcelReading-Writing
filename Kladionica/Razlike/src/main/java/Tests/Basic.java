package Tests;

import Pages.Mkladionica;
import Pages.OKladionica;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Basic {
    WebDriver driver;
    protected OKladionica oKladionica;
    protected Mkladionica mkladionica;


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        mkladionica = new Mkladionica(driver);
        oKladionica = new OKladionica(driver);


    }

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
