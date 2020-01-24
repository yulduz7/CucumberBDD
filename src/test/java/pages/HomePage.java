package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import util.SeleniumUtils;

public class HomePage {
    private static WebDriver driver = Driver.getDriver();
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://www.phptravels.net/']/img")
    public WebElement logo;

    @FindBy(xpath = "(//a[@id='dropdownCurrency'])[2]")
    public WebElement myAccount_Btn;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement signUp_Btn;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement logIn_Btn;

    public void rand(){
        logo.sendKeys();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void clickMyAccountBtn(){
        SeleniumUtils.click(myAccount_Btn);
    }

    public void clickSignUp(){
        clickMyAccountBtn();
        SeleniumUtils.click(signUp_Btn);
    }

}
