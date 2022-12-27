import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Testinit {
    //test1/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public WebElement laptopsTablets(){
        return elementByXpath("//img[@alt='Shop Laptops & Tablets']");
    }
    public WebElement laptop(){
        return elementByXpath("//img[@src='https://m.media-amazon.com/images/I/81Ivn5DIxhL._AC_UL320_.jpg']");
    }
    public WebElement image1(){
        return elementByXpath("//input[@aria-labelledby='a-autoid-5-announce']");
    }
    public WebElement image2(){
        return elementByXpath("//input[@aria-labelledby='a-autoid-6-announce']");
    }
    public WebElement image3(){
        return elementByXpath("//input[@aria-labelledby='a-autoid-7-announce']");
    }
    public WebElement image4(){
        return elementByXpath("//input[@aria-labelledby='a-autoid-8-announce']");
    }
    public WebElement image5(){
        return elementByXpath("//input[@aria-labelledby='a-autoid-9-announce']");
    }
    public WebElement image6(){
        return elementByXpath("//input[@aria-labelledby='a-autoid-10-announce']");
    }
    //test2/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public WebElement account(){
        return elementByXpath("//span[@id='nav-link-accountList-nav-line-1']");
    }
    public WebElement createAccount(){
        return elementByXpath("//a[@id='createAccountSubmit']");
    }
    public WebElement firstAndLastName(){
        return elementByXpath("//input[@placeholder='First and last name']");
    }
    public WebElement email(){
        return elementByXpath("//input[@name='email']");
    }
    public WebElement password(){
        return elementByXpath("//input[@type='password']");
    }
    public WebElement reEnterPassword(){
        return elementByXpath("//input[@name='passwordCheck']");
    }
    public WebElement continuee(){
        return elementByXpath("//input[@id='continue']");
    }
    //test3/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public WebElement signIn(){
        return elementByXpath("//span[@id='nav-link-accountList-nav-line-1']");
    }
    public WebElement emailSignIn(){
        return elementByXpath("//input[@name='email']");
    }
    public WebElement passwordSignIn(){
        return elementByXpath("//input[@name='password']");
    }
    public WebElement apply(){
        return elementByXpath("//input[@id='signInSubmit']");
    }
    //test4/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public WebElement electronics(){
        return elementByXpath("//img[@alt='Electronics']");
    }
    public WebElement airPods(){
        return elementByXpath("//img[@alt='Apple AirPods (2nd Generation) Wireless Earbuds with Lightning Charging Case Included. Over 24 Hours of Battery Life, Effo...']");
    }
    public WebElement addToCardAirPods(){
        return elementByXpath("//span[@data-csa-c-func-deps='aui-da-abb-accessory-add']");
    }
    //tet5//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void goToLaptopPage(){
        driver.get("https://www.amazon.com/Lenovo-IdeaPad-Essential-Computer-Graphics/dp/B09RND1LP2/ref=sr_1_8?fst=as%3Aoff&pd_rd_r=e490640c-169d-4ef3-bcb8-d07bce039239&pd_rd_w=hzC1N&pd_rd_wg=Y38rk&pf_rd_p=5b7fc375-ab40-4cc0-8c62-01d4de8b648d&pf_rd_r=2PHHP9W3C00SJ1ADQS4D&qid=1671107120&rnid=16225007011&s=computers-intl-ship&sr=1-8&th=1");
    }
    public WebElement openWindowDeliveryLocation(){
        return elementByXpath("//a[@id='nav-global-location-popover-link']");
    }
    public WebElement confirmThisDelivaryLocation(){
        return elementByXpath("//button[contains(text(),'Done')]");
    }
    public WebElement addTOcardLaptop(){
        return elementByXpath("//div[@id='addToCart_feature_div']");
    }
    public WebElement openCard(){
        return elementByXpath("//span[@id='attach-sidesheet-view-cart-button']");
    }
    public WebElement deleteLaptopFromCard(){
        return elementByXpath("//span[@id='attach-sidesheet-view-cart-button']");
    }
    //test6/////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test7/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public WebElement buttonChangeLanguage(){
        return elementByXpath("////span[@class='icp-container-desktop']");
    }
    public WebElement radioButtonDeutsch(){
        return elementByXpath("//input[@value='de_DE']");
    }
    public WebElement saveChanges(){
        return elementByXpath("//span[@id='icp-save-button']");
    }
    //Test8/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public WebElement openWindowDeliveryCountries(){
        return elementByXpath("//a[@id='nav-global-location-popover-link']");
    }
    public WebElement openListDeliveryCountry(){
        return elementByXpath("//span[@data-action='a-dropdown-button']");
    }
    public WebElement selectUKdeliveryCounty(){
        return elementByXpath("//a[contains(text(),'United Kingdom')]");
    }
}
