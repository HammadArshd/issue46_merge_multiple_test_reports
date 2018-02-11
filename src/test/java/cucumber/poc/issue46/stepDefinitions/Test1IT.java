package cucumber.poc.issue46.stepDefinitions;

import cucumber.api.java.en.Given;

public class Test1IT {


    @Given("^My Driver in Test1 is$")
    public void driverIs() throws Throwable {
        System.out.println("I am running from Test1 and method is: driverIs().");
        System.out.println("==========================");
    }
}
