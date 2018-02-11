package cucumber.poc.issue46.stepDefinitions;

import cucumber.api.java.en.Given;

public class Test2IT {

    @Given("^My Driver in Test2 is$")
    public void driverForChromeIs() throws Throwable {
        System.out.println("I am running from Test2 and method is: driverForChromeIs().");
        System.out.println("************************");
    }
}
