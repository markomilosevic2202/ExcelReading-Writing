package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavPage1 {

    WebDriver driver;
    //Header
    public NavPage1(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonAboutUs(){
        return driver.findElement(By.id("menu-item-10418"));
    }
    public WebElement getButtonProducts(){
        return driver.findElement(By.id("menu-item-25172"));
    }
    public WebElement getButtonBlog(){
        return driver.findElement(By.id("menu-item-25174"));
    }
    public WebElement getButtonContact(){
        return driver.findElement(By.id("menu-item-10420"));
        //return driver.findElements(By.id("menu-item-10420")).get(0);


    }

    public WebElement getButtonNet30(){
        return driver.findElement(By.xpath("//*[@class='header-actions d-flex align-items-center']/a[4]"));
    }
    public WebElement getButtonCreditPro(){
        return driver.findElement(By.className("navbar-brand"));
    }
    public WebElement getButtonSearch(){
        return driver.findElement(By.id("search-toggle"));
    }
    public WebElement getSearchWindows(){
        return driver.findElement(By.className("input-group"));
    }
    public WebElement getButtonCart(){
        return driver.findElement(By.id("search-toggle"));
    }
    public WebElement getButtonLogin(){
        return driver.findElement(By.className("menu-item login-icon position-relative"));
    }

    //Footer


}


