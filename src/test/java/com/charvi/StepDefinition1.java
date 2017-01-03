package com.charvi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 {
    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_42_cukes_in_my_belly(int cukes) throws Throwable {
        System.out.println("I have " + cukes + " cukes");
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_1_hour(int hour) throws Throwable {
        System.out.println("hours " + hour);
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_growl(String bellySound) throws Throwable {
        System.out.println("My belly should " + bellySound);
    }
}
