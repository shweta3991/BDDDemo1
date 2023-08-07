package api.cucumber.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithMultipleDataSteps {
    @Given("User is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() {
        System.out.println("userIsAtTheLoginPageOfTheApplication");
    }

    @When("User logs in with following username and password")
    public void userLogsInWithFollowingUsernameAndPassword() {
        System.out.println("userLogsInWithFollowingUsernameAndPassword");
    }

    @Then("user should be able to login with correct username and password")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() {
        System.out.println("userShouldBeAbleToLoginWithCorrectUsernameAndPassword");
    }
}
