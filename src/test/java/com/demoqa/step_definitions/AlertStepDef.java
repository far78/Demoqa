package com.demoqa.step_definitions;

import com.demoqa.pages.AlertsPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertStepDef {

    AlertsPage alertsPage = new AlertsPage();


    @Given("The user is on the alerts page")
    public void the_user_is_on_the_alerts_page() {
        String url = ConfigurationReader.get("url");

        Driver.get().get(url);


    }

    @When("The user clicks Second alert")
    public void the_user_clicks_Second_alert() {

        alertsPage.secondAlert.click();

    }

    @Then("The user takes {string} on pop")
    public void the_user_takes_on_pop(String expected) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.get().switchTo().alert();
        String actualTExt = alert.getText();
        alert.accept();
        BrowserUtils.waitFor(1);;

        Assert.assertEquals(expected, actualTExt);

    }
}

