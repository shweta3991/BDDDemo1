package api.cucumber.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExmaplesSteps {
    private WebDriver driver;

    @Given("User is on Home Page")
    public void userIsOnHomePage() throws Throwable{
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User navigate to login page")
    public void userNavigateToLoginPage() {
        System.out.println("user Navigate To Login Page");
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        System.out.println("Username is " + username + "Password is " + password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message displayed login successfully")
    public void messageDisplayedLoginSuccessfully() throws Throwable {
        System.out.println("Successfully Logged in");
        Thread.sleep(2000);
        driver.close();
    }
}
