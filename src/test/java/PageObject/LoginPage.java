package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement xpath_usename;

    @FindBy(xpath = "//input[@id='password']")
    WebElement xpath_password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement xpath_btnlogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enter_username(String userna) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(xpath_usename));
        xpath_usename.clear();
        xpath_usename.sendKeys(userna);
    }

    public void enter_password(String passw) {
        xpath_password.clear();
        xpath_password.sendKeys(passw);
    }

    public void btnlogin() {
        xpath_btnlogin.click();
    }
}
