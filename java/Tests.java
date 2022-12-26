import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends Testinit {
//check display images some product
    @Test
    public void test1(){
        goToAmazon();
        getElementByXpath("//img[@alt='Shop Laptops & Tablets']").click();
        getElementByXpath("//img[@src='https://m.media-amazon.com/images/I/81Ivn5DIxhL._AC_UL320_.jpg']").click();
        sleep(3);
        getElementByXpath("//input[@aria-labelledby='a-autoid-5-announce']").click();
        getElementByXpath("//input[@aria-labelledby='a-autoid-6-announce']").click();
        getElementByXpath("//input[@aria-labelledby='a-autoid-7-announce']").click();
        getElementByXpath("//input[@aria-labelledby='a-autoid-8-announce']").click();
        getElementByXpath("//input[@aria-labelledby='a-autoid-9-announce']").click();
        getElementByXpath("//input[@aria-labelledby='a-autoid-10-announce']").click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-5-announce']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-6-announce']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-7-announce']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-8-announce']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-9-announce']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-10-announce']")).isDisplayed());
        driver.quit();
    }
//sign up
    @Test
    public void test2(){
        goToAmazon();
        getElementByXpath("//span[@id='nav-link-accountList-nav-line-1']").click();
        getElementByXpath("//a[@id='createAccountSubmit']").click();

        getElementByXpath("//input[@placeholder='First and last name']").sendKeys("First and Last name");
        getElementByXpath("//input[@name='email']").sendKeys("email");
        getElementByXpath("//input[@type='password']").sendKeys("password");
        getElementByXpath("//input[@name='passwordCheck']").sendKeys("re-enter password");

        getElementByXpath("//input[@id='continue']").click();
        sleep(3);

        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu-my-account']")).isDisplayed());
        driver.quit();
    }
//sign in
    @Test
    public void test3(){
        goToAmazon();
        getElementByXpath("//span[@id='nav-link-accountList-nav-line-1']").click();
        getElementByXpath("//input[@name='email']").sendKeys("email");
        getElementByXpath("//input[@name='password']").sendKeys("password");
        getElementByXpath("//input[@id='signInSubmit']").click();

        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu-my-account']")).isDisplayed());
        driver.quit();
    }
//add to cart
    @Test
    public void test4(){
        goToAmazon();
        sleep(2);
        getElementByXpath("//img[@alt='Electronics']").click();
        getElementByXpath("//img[@alt='Apple AirPods (2nd Generation) Wireless Earbuds with Lightning Charging Case Included. Over 24 Hours of Battery Life, Effo...']").click();
        getElementByXpath("//span[@data-csa-c-func-deps='aui-da-abb-accessory-add']").click();

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());
        driver.quit();
    }
//delete item from cart
    @Test
    public void test5(){
        try {
            driver.get("https://www.amazon.com/Lenovo-IdeaPad-Essential-Computer-Graphics/dp/B09RND1LP2/ref=sr_1_8?fst=as%3Aoff&pd_rd_r=e490640c-169d-4ef3-bcb8-d07bce039239&pd_rd_w=hzC1N&pd_rd_wg=Y38rk&pf_rd_p=5b7fc375-ab40-4cc0-8c62-01d4de8b648d&pf_rd_r=2PHHP9W3C00SJ1ADQS4D&qid=1671107120&rnid=16225007011&s=computers-intl-ship&sr=1-8&th=1");
            sleep(2);
            driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
            sleep(2);
            getElementByXpath("//button[contains(text(),'Done')]").click();
            getElementByXpath("//div[@id='addToCart_feature_div']").click();
            sleep(3);
            getElementByXpath("//span[@id='attach-sidesheet-view-cart-button']").click();
            sleep(2);
            getElementByXpath("//input[@data-action='delete']").click();

            Assert.assertTrue(driver.findElement(By.xpath("//div[@class='a-row sc-cart-header')]")).isDisplayed());
        } finally {
            driver.quit();
        }
    }
//change region "polish"
    @Test
    public void test6(){
        goToAmazon();
        sleep(3);
        getElementByXpath("//span[contains(text(),'United States')]").click();
        getElementByXpath("//span[@class='a-dropdown-prompt']").click();
        getElementByXpath("//a[@id='icp-dropdown_13']").click();
        getElementByXpath("//input[@class='a-button-input']").click();
        sleep(2);

        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Świąteczne okazje i więcej')]")).isDisplayed());
        driver.quit();
    }
}
