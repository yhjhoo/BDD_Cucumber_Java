package step_definitions;

import implementation.Checkout;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

/**
 * @author yhjhoo
 * @since 1.0
 * date : 10 Aug, 2015
 *
 */

public class CheckoutSteps {
	int bananaPrice = 0;
	Checkout checkout;
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
	   bananaPrice = price;
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
	   checkout = new Checkout();
	   checkout.add(itemCount, bananaPrice);
	}

	@Then("^the total prise is (\\d+)c$")
	public void theTotalPriseIsC(int arg1) throws Throwable {
		int total = 40;
		assertEquals(total , checkout.total() );
	}
}
