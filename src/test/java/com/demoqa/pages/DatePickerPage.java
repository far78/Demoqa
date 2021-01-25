package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePickerPage extends BasePage {

    @FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
    public WebElement selectDate;
    @FindBy(xpath = "//button[contains(text(),'Next Month')]")
    public WebElement nextMonth;

    public void setDate(int day) {
        nextMonth.click();
        Driver.get().findElement(By.xpath("//div[contains(text(),'" + day + "')]")).click();

    }


}
