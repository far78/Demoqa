package com.demoqa.step_definitions;

import com.demoqa.pages.Droppable;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DroppableStepDef {
    Droppable droppable = new Droppable();

    @When("The user drags and drops the element")
    public void the_user_drags_and_drops_the_element() throws InterruptedException {
        BrowserUtils.waitForVisibility(droppable.dropHere,2);
        String beforeDrag = droppable.dropHere.getText();
        Actions actions = new Actions(Driver.get());
        BrowserUtils.waitForVisibility(droppable.dropHere,2);
        actions.dragAndDrop(droppable.dragMe, droppable.dropHere).perform();
        String afterDrop = droppable.dropHere.getText();
        Assert.assertFalse(beforeDrag.equals(afterDrop));
    }


    @Then("The text in the area changes as  {string}")
    public void theTextInTheAreaChangesAs(String expected) {

        String afterDrop = droppable.dropHere.getText();
        Assert.assertEquals(expected, afterDrop);

    }
}
