import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/Volumes/vOl2/projs/IdeaProjects/delmeTemoForCopare/naveenanimation20/issue46_merge_multiple_test_reports/src/test/resources/features/Test1.feature"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:/Volumes/vOl2/projs/IdeaProjects/delmeTemoForCopare/naveenanimation20/issue46_merge_multiple_test_reports/target/cucumber-parallel-extent/1.html", "json:/Volumes/vOl2/projs/IdeaProjects/delmeTemoForCopare/naveenanimation20/issue46_merge_multiple_test_reports/target/cucumber-parallel/1.json"},
        monochrome = true,
        tags = {},
        glue = {"cucumber.poc.issue46.stepDefinitions"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
