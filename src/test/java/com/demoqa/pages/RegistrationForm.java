package com.demoqa.pages;

import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationForm extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "userEmail")
    public WebElement email;
    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")
    public WebElement months;
    @FindBy(className = "react-datepicker__year-select")
    public WebElement years;
    @FindBy(xpath = "//div[@class='subjects-auto-complete__control css-yk16xz-control']/div[1]")
    public WebElement subjects;
    @FindBy(id = "subjectsInput")
    public WebElement subjectInput;
    @FindBy(xpath = "//label[contains(text(),'Female')]")
    public WebElement Gender;
    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    public WebElement reading;
    @FindBy(xpath = "//label[contains(text(),'Music')]")
    public WebElement music;
    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement chooseFile;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement currentAdres;
    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='react-select-4-input']")
    public WebElement city;
    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submit;
    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    public WebElement popupText;


    public void setGender(char m_or_f) {
        if (m_or_f == 'm' || m_or_f == 'M') {
            Driver.get().findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        } else if (m_or_f == 'f' || m_or_f == 'F') {
            Driver.get().findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        }
    }

    public void fillRegistrationForm(String name, String lastNam, String e_mail, char gender, String longMobile,
                                     String ddMonthyy, String subject, String sstate, String cityy, String adress) throws InterruptedException {
        firstName.sendKeys(name);
        lastName.sendKeys(lastNam);
        email.sendKeys(e_mail);
        setGender(gender);
        mobileNumber.sendKeys(longMobile);
        subjects.click();
        subjectInput.sendKeys(subject);
        subjectInput.sendKeys(Keys.ENTER);
        reading.click();
        BrowserUtils.waitFor(1);;

        String projectPath = System.getProperty("user.dir");
        String filePath = "\\demoqa.txt";
        String fullPath = projectPath + "\\" + filePath;

        chooseFile.sendKeys(fullPath);

        currentAdres.sendKeys(adress);

        BrowserUtils.waitFor(2);
        String date = ddMonthyy;
        String dateArr[] = date.split("-");
        String day = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        dateOfBirth.click();
        Select selectMonth = new Select(months);
        selectMonth.selectByVisibleText(month);
        BrowserUtils.waitFor(1);;
        Select selectYear = new Select(years);
        selectYear.selectByVisibleText(year);

        Driver.get().findElement(By.xpath("//div[contains(text(),'" + day + "')]")).click();


        BrowserUtils.waitFor(2);
        state.sendKeys(sstate);
        state.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(1);
        city.sendKeys(cityy);
        city.sendKeys(Keys.ENTER);


        BrowserUtils.waitFor(1);


    }

    public void makeSubmission() {

        submit.click();

    }
}
