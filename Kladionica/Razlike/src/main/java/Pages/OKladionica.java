package Pages;

import Tests.Utakmica;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class OKladionica {
    WebDriver driver;
    static List<Utakmica> utakmiceO = new ArrayList<Utakmica>();

    public OKladionica(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonSoccer() {
       // return this.driver.findElement(By.xpath("//*[@class='js-inplay-tabs-list']/li[3]"));
        return this.driver.findElement(By.xpath("//*[@class='biab_href biab_sport-item  ']"));

    }

    public WebElement getButtonSoccerPoStranicama() {
        return this.driver.findElement(By.xpath("//*[@class='js-subheader-links']/div/ul/li[3]/a"));
    }

    public WebElement getButtonNext() {
        return this.driver.findElement(By.xpath("//*[text() = 'Next ']"));
    }

    public void waitButtonNextClickable() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[text() = 'Next ']")));

    }

    public void waitButtonLastKvotaClickable() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@class='js-coming-up-sport-region biab_inplay-sport-competitions-list " +
                        "biab_inplay-by-time-list']/div/div/div[20]/table/tbody/tr/td[10]")));

    }
    public void setTime() throws InterruptedException {
       this.driver.findElement(By.id("ui-id-1-button")).sendKeys("Time");
        Thread.sleep(1000);

    }

    public void skrolovanjeNadole(Integer b) throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='js-content-wrapper']")).click();
        Actions a1 = new Actions(driver);
        for (int i = 0; i < b; i++) {
            a1.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(300);
        }


    }

    public List<Utakmica> getUtakmiceO() throws InterruptedException {
        String kec;
        String x;
        String dvojka;
        // waitButtonLastKvotaClickable();
        Thread.sleep(3000);
        List<WebElement> nizImenaOrbit =
             driver.findElements(By.xpath("//*[contains(@class,'biab_market-title-team-names js-teams')]"));
//        List<WebElement> nizKvoteOrbit =
//                driver.findElements(By.xpath("//*[contains(@class,'biab_bet-content biab_has-amount')]"));
        List<WebElement> nizKvoteOrbitKec =
                driver.findElements(By.xpath("//*[contains(@class,'biab_blue-cell js-blue-cell js-back-0 biab_bet-back js-bet-back biab_hidden-xs')]"));
        List<WebElement> nizKvoteOrbitX =
                driver.findElements(By.xpath("//*[contains(@class,'biab_blue-cell js-blue-cell js-back-2 biab_bet-back js-bet-back biab_hidden-xs')]"));
        List<WebElement> nizKvoteOrbitDvojka =
                driver.findElements(By.xpath("//*[contains(@class,'biab_blue-cell js-blue-cell js-back-1 biab_bet-back js-bet-back biab_hidden-xs')]"));

        System.out.println("Broj utakmica nadjenih na sajtu O: " + nizImenaOrbit.size());
        for (int i = 0; i < (nizImenaOrbit.size()); i++) {
            try {

                kec = nizKvoteOrbitKec.get(i).getText();
                x = nizKvoteOrbitX.get((i)).getText();
                dvojka = nizKvoteOrbitDvojka.get((i)).getText();
                utakmiceO.add(new Utakmica(nizImenaOrbit.get(i).getText(),
                        parseDouble(kec.substring(0, kec.indexOf('\n'))),
                        parseDouble(x.substring(0, x.indexOf('\n'))),
                        parseDouble(dvojka.substring(0, dvojka.indexOf('\n')))));

            } catch (Exception e) {
                //  System.out.println("GRESKA: Nije upisana utakmica u orbitu : " + nizImenaOrbit.get(i).getText());
            }

        }
        //System.out.println("Broj utakmica upisanih u listu O: " + utakmiceO.size());
        return utakmiceO;
    }

    public void stampajUtakmiceO() {
        for (int i = 0; i < utakmiceO.size(); i++) {
            utakmiceO.get(i).stampa();

        }
    }
}
