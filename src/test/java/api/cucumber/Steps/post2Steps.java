package api.cucumber.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class post2Steps {
    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println("1");
    }

    @When("I type the message as {string} in the text box")
    public void iTypeTheMessageAsInTheTextBox(String text) {
        System.out.println(text);
    }

    @And("Click on the Post button")
    public void clickOnThePostButton() {
        System.out.println("3");
    }

    @Then("The message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("4");
    }

    @When("User supply the youtube link as {string} in the text box")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String url) {
        System.out.println(url);
    }

    @Then("The video should get posted on the user wall")
    public void theVideoShouldGetPostedOnTheUserWall() {
        System.out.println("6");
    }

    @And("the video should have proper thumbnail.")
    public void theVideoShouldHaveProperThumbnail() {
        System.out.println("7");
    }
}
