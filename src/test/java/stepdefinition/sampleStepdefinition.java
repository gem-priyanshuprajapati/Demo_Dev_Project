package stepdefinition;

import implementation.sampleImplementation;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class sampleStepdefinition extends PageObject {
    private sampleImplementation sample = new sampleImplementation();

    @When("^user print the message$")
    public void print(){
        sample.printMsg();
    }
}
