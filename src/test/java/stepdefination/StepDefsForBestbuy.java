package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsForBestbuy {

    @Given("I navigate to www.bestbuy.com")
    public void i_navigate_to_www_bestbuy_com() {
        System.out.println("I went to Bestbuy Website");
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I click on Account signin button")
    public void i_click_on_Account_signin_button() {
        System.out.println("I Clicked on signin");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter UserID and Password")
    public void i_enter_UserID_and_Password() {
        System.out.println("I Enter ID & Password");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I CLICK on Signin button")
    public void i_CLICK_on_Signin_button() {
        System.out.println("I Clicked on signin button");
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I should go to home page")
    public void i_should_go_to_home_page() {
        System.out.println("I went to home page");

        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter wrong UserID and password")
    public void i_enter_wrong_UserID_and_password() {
        System.out.println("I entered worng ID & password");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I click on Signin button")
    public void i_click_on_Signin_button() {
        System.out.println("I Clicked on signin button");
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I Should see error message")
    public void i_Should_see_error_message() {
        System.out.println("I saw Error message");
        // Write code here that turns the phrase above into concrete actions

    }
}
