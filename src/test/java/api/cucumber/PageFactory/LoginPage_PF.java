package api.cucumber.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class LoginPage_PF {
    @FindBy(id= "name")
    WebElement txt_username;

    @FindBy(id= "password")
    WebElement txt_password;

    @FindBy(id= "login")
    WebElement btn_login;

    @FindBy(partialLinkText = "raghav")
    List<WebElement> myLinks;

    @FindBy(how = How.ID, using = "name")
    WebElement abc;

    WebDriver driver;

    public LoginPage_PF(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }

    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickLogin(){
        btn_login.click();
    }

}
