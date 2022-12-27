import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends Testinit  {
    BasePage bp = new BasePage();
//check display images some product
    @Test
    public void test1(){
        goToAmazon();
        bp.laptopsTablets().click();
        bp.laptop().click();
        sleep(3);
        bp.image1().click();
        bp.image2().click();
        bp.image3().click();
        bp.image4().click();
        bp.image5().click();
        bp.image6().click();

        Assert.assertTrue(elementByXpath("//input[@aria-labelledby='a-autoid-5-announce']").isDisplayed());
        Assert.assertTrue(elementByXpath("//input[@aria-labelledby='a-autoid-6-announce']").isDisplayed());
        Assert.assertTrue(elementByXpath("//input[@aria-labelledby='a-autoid-7-announce']").isDisplayed());
        Assert.assertTrue(elementByXpath("//input[@aria-labelledby='a-autoid-8-announce']").isDisplayed());
        Assert.assertTrue(elementByXpath("//input[@aria-labelledby='a-autoid-9-announce']").isDisplayed());
        Assert.assertTrue(elementByXpath("//input[@aria-labelledby='a-autoid-10-announce']").isDisplayed());
        driver.quit();
    }
//sign up
    @Test
    public void test2(){
        goToAmazon();
        bp.account().click();
        bp.createAccount().click();
        bp.firstAndLastName().sendKeys("First and Last name");
        bp.email().sendKeys("email");
        bp.password().sendKeys("password");
        bp.reEnterPassword().sendKeys("re-enter password");
        bp.continuee().click();
        sleep(3);

        Assert.assertTrue(elementByXpath("//a[@id='menu-my-account']").isDisplayed());
        driver.quit();
    }
//sign in
    @Test
    public void test3(){
        goToAmazon();
        bp.signIn().click();
        bp.emailSignIn().sendKeys("email");
        bp.passwordSignIn().sendKeys("password");
        bp.apply().click();

        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu-my-account']")).isDisplayed());
        driver.quit();
    }
//add to cart
    @Test
    public void test4(){
        goToAmazon();
        sleep(2);
        bp.electronics().click();
        bp.airPods().click();
        bp.addToCardAirPods().click();

        Assert.assertTrue(elementByXpath("//h1").isDisplayed());
        driver.quit();
    }
//delete item from cart
    @Test
    public void test5(){
        try {
            bp.goToLaptopPage();
            sleep(2);
            bp.openWindowDeliveryLocation().click();
            sleep(2);
            bp.confirmThisDelivaryLocation().click();
            bp.addTOcardLaptop().click();
            sleep(3);
            bp.openCard().click();
            sleep(2);
            bp.deleteLaptopFromCard().click();
            sleep(3);

            Assert.assertTrue(elementByXpath("//div[@class='a-row sc-cart-header')]").isDisplayed());
        } finally {
            driver.quit();
        }
    }
//change region "polish"
    @Test
    public void test6(){
        goToAmazon();
        sleep(3);
        elementByXpath("//span[contains(text(),'United States')]").click();
        elementByXpath("//span[@class='a-dropdown-prompt']").click();
        elementByXpath("//a[@id='icp-dropdown_13']").click();
        elementByXpath("//input[@class='a-button-input']").click();
        sleep(2);

        Assert.assertTrue(elementByXpath("//a[contains(text(),'Świąteczne okazje i więcej')]").isDisplayed());
        driver.quit();
    }
//Change Language on Deutsch
    @Test
    public void test7(){
        try {
            goToAmazon();
            sleep(3);
            bp.buttonChangeLanguage().click();
            bp.radioButtonDeutsch().click();
            bp.saveChanges().click();

            Assert.assertTrue(elementByXpath("//div[contains(text(),'DE')]").isDisplayed());
        }finally {
            driver.quit();
        }
    }
    //Change deliver country
    @Test
    public void test8(){
        goToAmazon();
        sleep(2);
        elementByXpath("//a[@id='nav-global-location-popover-link']").click();
        sleep(2);
        elementByXpath("//span[@data-action='a-dropdown-button']").click();
        elementByXpath("//a[contains(text(),'United Kingdom')]").click();
        elementByXpath("//button[contains(text(),'Done')]").click();

        Assert.assertTrue(elementByXpath("//a[@id='nav-global-location-popover-link']").isDisplayed());
    }
}
