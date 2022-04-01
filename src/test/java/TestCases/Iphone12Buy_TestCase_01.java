package TestCases;

import BasicPackages.DriverSetUp;
import PageObjects.Iphone12Buy_PageObject_01;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iphone12Buy_TestCase_01 extends DriverSetUp {

    public static String baseUrl = "https://www.amazon.co.uk/";

    @Test
    public static void cartIPhone() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(4000);

        Iphone12Buy_PageObject_01 aIphone12Buy_pageObject_01 = new Iphone12Buy_PageObject_01(driver);

        aIphone12Buy_pageObject_01.search.sendKeys("iphone 12");
        Thread.sleep(3000);

        aIphone12Buy_pageObject_01.search.sendKeys(Keys.ENTER);
        Thread.sleep(15000);

        aIphone12Buy_pageObject_01.iphone1.click();
        Thread.sleep(4000);

        aIphone12Buy_pageObject_01.addToCart.click();
        Thread.sleep(4000);



    }


}
