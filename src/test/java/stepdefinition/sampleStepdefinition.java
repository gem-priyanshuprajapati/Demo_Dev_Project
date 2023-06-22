package stepdefinition;

import implementation.sampleImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class sampleStepdefinition extends PageObject {
    private sampleImplementation sample = new sampleImplementation();
    private static final Logger LOGGER = LoggerFactory.getLogger(sampleStepdefinition.class);
    WebDriver driver = getDriver();

    @When("^User launches the website$")
    public void userLaunchesTheWebsite() {

        driver.get("https://www.w3schools.com/");
    }

    @Then("^user verify heading of the website$")
    public void userVerifyHeaderOfTheWebsite() {

      if( $("//div[@class='w3-content learntocodecontent']/h1").isDisplayed()) {
         LOGGER.info("verified successfully");
        }else{
          Assert.fail("Failed to verify element");
      }
    }
}
