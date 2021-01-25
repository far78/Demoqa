package com.demoqa.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTips extends BasePage {

    @FindBy(xpath = "//button[@id='toolTipButton']")
    public WebElement button;

    @FindBy(id = "buttonToolTip")
    public WebElement buttonText;

    @FindBy(id = "toolTipTextField")
    public WebElement toolTipTextField;

    @FindBy(id = "textFieldToolTip")
    public WebElement textField;


}
