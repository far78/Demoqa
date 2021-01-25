package com.demoqa.step_definitions;

import com.demoqa.pages.DatePickerPage;
import com.demoqa.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DatePickerStepDef {
    DatePickerPage datePickerPage = new DatePickerPage();
    String currentDate = datePickerPage.selectDate.getAttribute("value");

    @Then("The user sets the Date to in the future")
    public void the_user_sets_the_Date_to_in_the_future() throws InterruptedException {
        String currentDate = datePickerPage.selectDate.getAttribute("value");

        String[] dates = currentDate.split("/");
        int day = Integer.parseInt(dates[1]);
        BrowserUtils.waitFor(1);;
        datePickerPage.selectDate.click();
        BrowserUtils.waitFor(1);;
        datePickerPage.setDate(day);

        Thread.sleep(1000);
    }

    @Then("The Date is next month")
    public void the_Date_is_next_month() {

        String afterChange = datePickerPage.selectDate.getAttribute("value");
        String[] currentMonth = this.currentDate.split("/");
        String[] afterchng = afterChange.split("/");


        int currentMnth = Integer.parseInt(currentMonth[0]);
        int changedMnth = Integer.parseInt(afterchng[0]);
        //Compare future month is bigger than current month

        Assert.assertTrue(changedMnth == currentMnth + 1);
        Assert.assertFalse(afterChange.equals(this.currentDate));


    }

}
