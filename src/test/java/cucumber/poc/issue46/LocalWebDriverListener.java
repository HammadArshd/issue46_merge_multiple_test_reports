package cucumber.poc.issue46;

public class LocalWebDriverListener  {


    public void beforeInvocation() {
        System.out.println("Hi: From class LocalWebDriverListener and method beforeInvocation.");
        System.out.println();
    }

    public void afterInvocation() {
        System.out.println("Hi: From class LocalWebDriverListener and method afterInvocation.");
        System.out.println();
    }
}