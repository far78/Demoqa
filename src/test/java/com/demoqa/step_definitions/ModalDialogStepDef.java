package com.demoqa.step_definitions;

import com.demoqa.pages.ModalDialogPage;
import com.demoqa.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ModalDialogStepDef {
    ModalDialogPage modalDialogPage = new ModalDialogPage();

    @When("The user clicks {string}")
    public void the_user_clicks(String string) {
        modalDialogPage.smallModal.click();


    }

    @Then("{string} is on tthe openning modal")
    public void is_on_tthe_openning_modal(String expected) {
        String actualText = modalDialogPage.smallModallText.getText();
        Assert.assertEquals(expected, actualText);
    }


    @And("The user closes the modal")
    public void theUserClosesTheModal() throws InterruptedException {
        modalDialogPage.closeModal.click();
        BrowserUtils.waitFor(1);;

    }
}
