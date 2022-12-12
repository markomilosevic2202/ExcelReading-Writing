package Pages;

import Tests.Utakmica;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class Mkladionica {

    WebDriver driver;
    List<Utakmica> utakmiceM = new ArrayList<Utakmica>();

    public Mkladionica(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonSoccer() {
        //return this.driver.findElement(By.xpath("//*[text() = 'Soccer']"));
        return this.driver.findElement(By.xpath("//*[@class='biab_href biab_sport-item  ']"));

    }

    public WebElement getSlidre() {
        return driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle ui-state-default ui-corner-all')]"));
    }

    public WebElement getButtonFutbal() {
        return driver.findElement(By.xpath("//*[text() = 'Fudbal']"));
    }

    public WebElement getButtonIzaberiSve() {
        return driver.findElement(By.xpath("//*[text() = 'Izaberi sve']"));
    }

    public WebElement getButtonBonusKvote() {
        return driver.findElement(By.xpath("//*[text() = 'Max Bonus Tip Fudbal ']"));
    }

    public List<WebElement> getListuNaziva() {
        return driver.findElements(By.xpath("//*[contains(@class,'teams-overflow ng-binding')]"));
    }

    public List<WebElement> getListuKvota() {
        return driver.findElements(By.xpath("//*[contains(@class,'bottom')]"));
    }

    public List<WebElement> getTermin() {
        return driver.findElements(By.xpath("//*[contains(@class,'f-09 cc-match-kickoff ng-binding')]"));
    }

    public List<Utakmica> getUtkmiceMkladionica() {
        List<WebElement> nizImenaM = getListuNaziva();
        List<WebElement> nizKvoteM = getListuKvota();
        List<WebElement> nizTermina = getTermin();
        System.out.println("Broj uhvaćenih naziva: " + nizImenaM.size());
        for (int i = 0; i < nizImenaM.size(); i++) {
            try {
                utakmiceM.add(new Utakmica(nizImenaM.get(i).getText(), parseDouble(nizKvoteM.get(i * 7).getText())
                        , parseDouble(nizKvoteM.get((i * 7 + 1)).getText()), parseDouble(nizKvoteM.get((i * 7 + 2)).getText()),
                        nizTermina.get(i).getText().substring(0, 6), nizTermina.get(i).getText().substring(7, 12)));

            } catch (Exception e) {
                System.out.println("GRESKA: Nije upisana utakmica u listuM : " + nizImenaM.get(i).getText());
            }

        }
        System.out.println("Broj utakmica upisanih u niz: " + utakmiceM.size());
        return utakmiceM;

    }

    public void stampajUtakmiceM() {
        for (int i = 0; i < utakmiceM.size(); i++) {
            utakmiceM.get(i).stampa();

        }
    }

    public void podesiVremePregleda(Integer a) {
        for (int i = 1; i <= a; i++) {            // postavljanje klizaca na zeljenu vrednos i = 2 je 24h
            getSlidre().sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void skrolovanjeNadole(Integer b) throws InterruptedException {
        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(5000);
        for (int i = 0; i < b; i++) {
            a.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(500);
        }
    }
}
