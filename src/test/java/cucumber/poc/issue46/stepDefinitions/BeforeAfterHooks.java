package cucumber.poc.issue46.stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfterHooks {

    @Before
    public void deleteAllCookies() {
        System.out.println("Deleting all cookies...");
        System.out.println();
    }

    @After
    public static void embedScreenshot() {
        System.out.println("embedScreenshot() if scenario fails.");
        System.out.println();
    }
}