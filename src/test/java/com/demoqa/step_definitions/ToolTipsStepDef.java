package com.demoqa.step_definitions;

import com.demoqa.pages.ToolTips;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsStepDef {

    ToolTips toolTips = new ToolTips();

    @When("The user hover over the {string}")
    public void the_user_hover_over_the(String button) throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        if (button.equals("Button")) {
            BrowserUtils.waitForVisibility(toolTips.button, 2);
            actions.moveToElement(toolTips.button).build().perform();
            BrowserUtils.waitForVisibility(toolTips.buttonText, 2);
        } else if (button.equals("Field")) {
            actions.moveToElement(toolTips.toolTipTextField).perform();
            BrowserUtils.waitForVisibility(toolTips.textField, 2);
        }


    }


    @Then("The user  receives {string} text")
    public void theUserReceivesText(String expected) throws InterruptedException {
        if (expected.contains("Button")) {
            String actualText = toolTips.buttonText.getText();
            Assert.assertEquals(expected, actualText);

        } else if (expected.contains("field")) {

            String actualText = toolTips.textField.getText();
            System.out.println("actualText = " + actualText);
            Assert.assertEquals(expected, actualText);

        }


    }
}
