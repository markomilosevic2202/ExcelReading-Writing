package Tests;

import Pages.Mkladionica;
import Pages.OKladionica;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class HvatanjeElelmenata {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        OKladionica oKladionica = new OKladionica(driver);

        List<Utakmica> utakmiceOkladionica = new ArrayList<Utakmica>();
        driver.manage().window().maximize();
        String okladionicaUrl = "https://orbitxch.com/customer/inplay/highlights/1";
        driver.get(okladionicaUrl);
        Thread.sleep(2000);
        oKladionica.getButtonSoccerPoStranicama().click();

        for (int i = 0; i < 4; i++) {
            Thread.sleep(1000);
            oKladionica.skrolovanjeNadole(2);
            oKladionica.getUtakmiceO();
            oKladionica.waitButtonNextClickable();
            oKladionica.getButtonNext().click();

        }
        utakmiceOkladionica=oKladionica.getUtakmiceO();

        System.out.println("Velicina niza: " + utakmiceOkladionica.size());
        driver.close();
    }


   }

