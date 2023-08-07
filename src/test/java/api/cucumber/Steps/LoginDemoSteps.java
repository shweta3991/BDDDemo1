package api.cucumber.Steps;

import api.cucumber.PageFactory.HomePage_PF;
import api.cucumber.PageFactory.LoginPage_PF;
import api.cucumber.Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {
    WebDriver driver = null;
    //loginPage login;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("-----I am inside Browser is open-----");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("user enters {} and {}")
    public void userEntersAnd(String username, String password) throws Throwable {
        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);

    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        home= new HomePage_PF(driver);
        home.checkLogOutIsDisplayed();
        //Assert.assertTrue(home.checkLogOutIsDisplayed());
        Thread.sleep(2000);
        driver.close();
    }
}
