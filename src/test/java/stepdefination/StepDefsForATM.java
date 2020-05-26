package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsForATM {

    @Given("I insert the card in ATM machine")
    public void i_insert_the_card_in_ATM_machine() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Card inserted");
    }

    @Given("I am asked to enter the Pin")
    public void i_am_asked_to_enter_the_Pin() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Asked for Pin ");
    }
    @When("I enter currect Pin")
    public void i_enter_currect_Pin() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entered Pin");
    }
    @Then("I should be able to see option to withdraw money")
    public void i_should_be_able_to_see_option_to_withdraw_money() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I got money");
    }
}
