package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iphone12Buy_PageObject_01 extends PageObject {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement search;

    //input[@name="email" or contains(@placeholder,’abc’)]
    @FindBy(xpath = "//span[@class=\"a-size-medium a-color-base a-text-normal\" or contains(@xpath,'1')]")
    public WebElement iphone1;



    //input[@name="email" and contains(@placeholder,'Email')]
//    @FindBy(xpath = "//input[@id="add-to-cart-button" and contains(@name,'submit.add-to-cart')]")
//    public WebElement addToCart;

//    @FindBy(xpath = "//input[@id="a-button a-spacing-small a-button-primary a-button-icon" and contains(@name,'submit.add-to-cart')]")
//    public WebElement addToCart;


//    @FindBy(xpath = "//input[@id='add-to-cart-button']")
//    public WebElement addToCart;

    @FindBy(xpath = "//input[@title='Add to Shopping Cart']")
    public WebElement addToCart;


    public Iphone12Buy_PageObject_01(WebDriver driver) {
        super(driver);

    }
}
