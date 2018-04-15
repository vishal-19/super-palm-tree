package com.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * This is called step Definition class in this we implement the feature file
 * lines with some regular expression like (.+), regular expression makes step
 * definition understand that the values at this place are arguments coming from
 * feature files
 * 
 * @author vishal
 *
 */
public class StepDef {

	private int a;
	private int b;
	private int result;

	/**
	 * Here we are implementing the first line of first scenario of our feature file
	 * and as arguments are coming so to take them as input we are using (.+) means
	 * value at that place is an argument these line should exactly match with the
	 * feature file lines
	 * 
	 * @param a
	 * @param b
	 */

	@Given("^i have two numbers (.+) and (.+)$")
	public void iHaveTwoNumbers(int a, int b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * when action is performed ,means addition is performed. here also note that
	 * lines should match exactly same as feature file lines
	 */
	@When("^i add these numbers$")
	public void addTheseNumbers() {

		CalculatorProject calculatorProject = new CalculatorProject();
		result = calculatorProject.addValues(a, b);

	}

	/**
	 * Here we are finally verifying our last statement of scenario of our feature
	 * file here also we use (.+) to take the incoming value from feature file as an
	 * argument
	 * 
	 * @param c
	 */
	@Then("^i get (.+)$")
	public void getResult(int c) {

		Assert.assertEquals(c, result);

	}

	/**
	 * Here we are verifying the multiplication method
	 */
	@When("^i multiply these$")
	public void multiplyThese() {
		CalculatorProject calculatorProject = new CalculatorProject();
		result = calculatorProject.multiplyValues(a, b);
	}

}
