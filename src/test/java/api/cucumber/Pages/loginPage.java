package api.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;

    private By txt_username= By.id("name");

    private By txt_password= By.id("password");

    private By btn_login = By.id("login");

    private By btn_Logout= By.id("logout");

    public loginPage(WebDriver driver){
        this.driver= driver;
        if(!driver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not Login Page. The current page is: " +
                    driver.getCurrentUrl());
        }
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public boolean checkLogOutIsDisplayed(){
        return driver.findElement(btn_Logout).isDisplayed();
    }

    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
