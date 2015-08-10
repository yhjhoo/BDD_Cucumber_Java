package step_definitions;

import implementation.Checkout;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

/**
 * @author yhjhoo
 * @since 1.0 date : 10 Aug, 2015
 *
 */

public class CheckoutSteps {
	int bananaPrice = 0;
	Checkout checkout = new Checkout();
	int applePrice = 0;

	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String itemName, int price) throws Throwable {
		switch (itemName) {
		case "apple":
			applePrice = price;
			break;
		case "banana":
			bananaPrice = price;
			break;

		default:
			break;
		}
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
		switch (itemName) {
		case "apple":
			checkout.add(itemCount, applePrice);
			break;
		case "banana":
			checkout.add(itemCount, bananaPrice);
			break;

		default:
			break;
		}
	}

	@Then("^the total prise is (\\d+)c$")
	public void theTotalPriseIsC(int total) throws Throwable {
		assertEquals(total, checkout.total());
	}
}
