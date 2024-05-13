package StepDefinitions;

import Helper.BrowserC;
import Helper.ReadExcel;
import Helper.Takescreen;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    //BrowserC browserC= new BrowserC();

    final WebDriver driver = BrowserC.browserChoice("chrome","https://www.saucedemo.com/") ;

    LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);

    Takescreen takescreen=PageFactory.initElements(driver,Takescreen.class);

    ReadExcel readExcel=PageFactory.initElements(driver, ReadExcel.class);
}
