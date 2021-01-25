package com.demoqa.pages;

import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void navigateToModule(String tab, String modul) throws InterruptedException {

        switch (tab) {
            case "Elements":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])")).click();
                break;
            case "Forms":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
                break;
            case "Alerts":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
                break;
            case "Widgets":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
                break;
            case "Interactions":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[5]")).click();
                break;
            case "Book":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[6]")).click();
                break;
        }

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 1; i++) {
            BrowserUtils.waitFor(1);
            if (tab.equals("Widgets") || tab.equals("Interactions")) {
                jse.executeScript("window.scrollBy(0,400)");
            } else {
                jse.executeScript("window.scrollBy(0,230)");
            }

        }
        WebElement module = Driver.get().findElement(By.xpath("//span[text()='" + modul + "']"));
        module.click();

    }

}
