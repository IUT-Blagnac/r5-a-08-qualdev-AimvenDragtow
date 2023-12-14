package dojo;

import com.mycompany.app.Order;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CocktailSteps {
    private Order order;

    /*
    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String owner) {
        order = new Order();
        order.declareOwner(owner);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_Juliette(String target) {
        order.declareTarget(target);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_no_cocktail_in_the_order(int nbCocktails) {
        List<String> cocktails = order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }
    */

    @Given("^([a-zA-Z]+) who wants to buy a drink$")
    public void who_wants_to_buy_a_drink(String from) {
        order = new Order();
        order.declareOwner(from);
    }

    @When("an order is declared for ([a-zA-Z]+)")
    public void an_order_is_declared_for(String to) {
        order.declareTarget(to);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_no_cocktail_in_the_order(int nbCocktails) {
        List<String> cocktails = order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }

    @And("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        order.addMessage(message);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String expected) {
        String ticket = order.getTicket();
        assertEquals(expected, ticket);
    }
}
