package B.pagesPackage;


import C.utilsPackage.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static A.TestBasePackage.BaseClass.driver;

public class LoginWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement login;

    // these variable will be intialized by constructor

    public LoginWithPageFactory(){

        PageFactory.initElements(driver,this);
    }

}
