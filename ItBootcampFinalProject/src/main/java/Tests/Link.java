package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Link extends BasicTest{
    @Test(priority = 10)
    public void checksLinkHeader() throws InterruptedException {

        navPage1.getButtonProducts().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/products"),
                "[ERROR] Not on a good page(products)");
       // Thread.sleep(15000);

        navPage1.getButtonAboutUs().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/about-us"),
                "[ERROR] Not on a good page(about-us)");

        navPage1.getButtonBlog().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/blog"),
                "[ERROR] Not on a good page(blog)");

        navPage1.getButtonContact().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/contact-us"),
                "[ERROR] Not on a good page(contact-us)");

        navPage1.getButtonNet30().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/get-net-30-vendor-account-fast"),
                "[ERROR] Not on a good page(get-net-30-vendor-account-fast)");

        navPage1.getButtonCreditPro().click();
        Assert.assertTrue(
                driver.getCurrentUrl().equals("https://crediitpro.com/"),
                "[ERROR] Not on a good page(home)");


    navPage1.getButtonSearch().click();
   // Thread.sleep(3000);
        Assert.assertTrue(
                navPage1.getSearchWindows().isDisplayed(),
                "[ERROR] Windows cearch not display");
        System.out.println( navPage1.getSearchWindows().isDisplayed());

}
    @Test(priority = 20)
    public void checksLinkFooter() throws InterruptedException {

    }



}

