package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Droppable extends BasePage {
    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement dragMe;
    @FindBy(xpath = "//div[@id='simpleDropContainer']//div[@id='droppable']")
    public WebElement dropHere;


}
