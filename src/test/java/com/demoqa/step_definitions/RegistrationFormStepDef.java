package com.demoqa.step_definitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.RegistrationForm;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class RegistrationFormStepDef {

    RegistrationForm register = new RegistrationForm();

    @Given("The user is on the {string} page")
    public void the_user_is_on_the_page(String page) throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        if (page.equals("Practice Form")) {
            register.navigateToModule("Forms", page);
        } else if (page.equals("Alerts") || page.equals("Modal Dialogs")) {
            register.navigateToModule("Alerts", page);
        } else if (page.equals("Tool Tips") || page.equals("Date Picker")) {
            register.navigateToModule("Widgets", page);
        } else if (page.equals("Droppable")) {
            register.navigateToModule("Interactions", page);
        }


    }


    @When("The user enters all the details")
    public void the_user_enters_all_the_details() throws InterruptedException {

        register.fillRegistrationForm("Mike", "Henry", "mike@hotmail.com", 'm',
                "1234567890", "11-January-2016", "Maths", "Uttar Pradesh", "Lucknow", "London");


    }

    @When("The user submits the form")
    public void the_user_submits_the_form() {

        register.makeSubmission();
    }


    @Then("The user receives {string} on a pop up")
    public void theUserReceivesOnAPopUp(String expectedText) {

        String actualText = register.popupText.getText();

        Assert.assertEquals(expectedText, actualText);


    }


    @When("The user doesnt fill the {string} box")
    public void the_user_doesnt_fill_the_box(String string) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 1; i++) {
            jse.executeScript("window.scrollBy(0,400)");
        }

    }

    @Then("The user dosnt receive popup message")
    public void the_user_dosnt_receive_popup_message() {

    }

}
