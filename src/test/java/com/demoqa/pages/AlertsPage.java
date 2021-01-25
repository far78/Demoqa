package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {
    @FindBy(xpath = "//button[@id='timerAlertButton']")
    public WebElement secondAlert;
}
