package TestRunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = {"stepDefinitions"},
        tags = "@Activity1.feature",
        plugin = {"pretty"},
        monochrome = true
)

public class ActivityRunners1 {
    //This is intentionally blank
}