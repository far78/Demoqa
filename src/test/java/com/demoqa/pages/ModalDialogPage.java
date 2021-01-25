package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalDialogPage extends BasePage {

    @FindBy(xpath = "//button[@id='showSmallModal']")
    public WebElement smallModal;
    @FindBy(xpath = "//button[@id='closeSmallModal']")
    public WebElement closeModal;
    @FindBy(xpath = "//div[contains(text(),'This is a small modal. It has very less content')]")
    public WebElement smallModallText;
}
