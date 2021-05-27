package com.sparta.jakub.stepdefs;

import com.sparta.jakub.Raindrops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class RaindropsStepDefs {
    private Raindrops raindrops;
    private int number;
    private String outputMessage;

    @Given("I input number {int}")
    public void iInputNumber(int number) {
        raindrops = new Raindrops();
        this.number = number;
    }

    @When("I run the plingPlangPlong method")
    public void iRunThePlingPlangPlongMethod() {
        outputMessage = raindrops.plingPlangPlong(number);
    }

    @Then("The return should be {string}")
    public void theReturnShouldBe(String expectedMessage) {
        Assertions.assertEquals(expectedMessage, outputMessage);
    }
}
