package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStage {

    public WebDriver driver;
    public BookStage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//a[@title='Add to List']")
    private WebElement addtolistbutton;

    @FindBy(xpath = "//*[contains(text(), 'View Your List')]")
    private WebElement closepopuplistBtn;

    public void clickAddlistButton() {
        addtolistbutton.click(); }

    public void clickClosePopListBtn() {
        closepopuplistBtn.click();
    }

}
