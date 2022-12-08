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
//checking sign up
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
//checking sign in
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
//checking add to cart
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
}
