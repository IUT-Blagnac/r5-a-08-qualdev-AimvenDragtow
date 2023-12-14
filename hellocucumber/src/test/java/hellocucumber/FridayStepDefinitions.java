package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FridayStepDefinitions {
    private String today;

    @Given("today is {string}")
    public void todayIsDay(String day) {
        this.today = day;
    }

    @When("I ask if it's Friday yet")
    public void iAskIfItSFridayYet() {
    }

    @Then("I should be told {string}")
    public void iShouldBeToldAnswer(String answer) {
        assertEquals(answer, IsItFriday.isItFriday(this.today));
    }
}
