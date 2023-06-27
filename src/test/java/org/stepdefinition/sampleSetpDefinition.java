package org.stepdefinition;

import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.implementation.sampleImplementation;

public class sampleSetpDefinition extends PageObject {
    @When("^user print message$")
    public void userLaunchesTheWebsite() {
        sampleImplementation.printMsg();
        System.out.println("dkjfkjsdf");
    }
}
