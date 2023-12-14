package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    /*@Given("today is Sunday")
    public void today_is_Sunday() {
        this.today = "Sunday";
    }

    @When("I ask if it's Friday yet")
    public void i_ask_if_it_s_Friday_yet() {
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, hellocucumber.IsItFriday.isItFriday(this.today));
    }


    @Given("today is Friday")
    public void today_is_Friday() {
        this.today = "Friday";
    }*/

}