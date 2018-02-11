package cucumber.poc.issue46.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SignInIT {


    @Given("^Hit the URL (.+)$")
    public void hitTheURLHttpQaDbserver(String URL) throws Throwable {
        System.out.println("I am running from class SignIn and the method is: hitTheURLHttpQaDbserver, and the URL is: " + URL);
        System.out.println();
    }

    @And("^Choose to Sign In$")
    public void chooseToSignIn() throws Throwable {
        System.out.println("I am running from class SignIn and the method is: chooseToSignIn.");
        System.out.println();
    }
}
