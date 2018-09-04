package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by balajakka on 04/09/2018.
 */
public class CucumberTagTest {
    @Given("^I am sanity tag tester$")
    public void i_am_sanity_tag_tester(){
        System.out.println("I am sanity tag tester");
    }
    @Given("^I am smoke tag tester$")
    public void i_am_smoke_tag_tester(){
        System.out.println("I am smoke tag tester");
    }
    @Given("^I am reg tag tester$")
    public void i_am_reg_tag_tester(){
        System.out.println("I am reg tag tester");
    }
    @When("^I access sanity pack")
    public void i_access_san_pac(){
        System.out.println("I access reg pack");

    }
    @When("^I access smoke pack")
    public void i_access_smoke_pac(){
        System.out.println("I access smoke pack");

    }
    @When("^I access regression pack")
    public void i_access_reg_pac(){
        System.out.println("I acess reg pack");

    }
    @Then("^I see sanity pack test result")
    public void i_see_san_pac(){
        System.out.println("I see reg pack");

    }
    @Then("^I see smoke pack test result")
    public void i_see_smoke_pac(){
        System.out.println("I see smoke pack");

    }
    @Then("^I see regression pack test result")
    public void i_see_reg_pac(){
        System.out.println("I see reg pack");

    }
}


