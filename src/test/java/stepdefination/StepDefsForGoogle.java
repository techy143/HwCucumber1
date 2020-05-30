package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefsForGoogle {

    @Given("I open a browser")
    public void i_open_a_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Browser opened");
    }

    @Given("I navigate to www.google.com")
    public void i_navigate_to_www_google_com() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigate to google");
    }

    @Then("I validate the search text field")
    public void i_validate_the_search_text_field() {
        // Write code here that turns the phrase above into concrete actions
    }

}
