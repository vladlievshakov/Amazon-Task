package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignStage {

    public WebDriver driver;
    public SignStage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement signfield;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement signlogBtn;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement passfield;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement signpassBtn;

    @FindBy(xpath = "//span[normalize-space()='Account & Lists']")
    public WebElement popupMenu;

    @FindBy(xpath = "//span[@class='nav-text'][normalize-space()='Shopping List']")
    public WebElement popupListbnt;

    @FindBy(xpath = "//input[@id='add-to-wishlist-button-submit']")
    public WebElement addbooktolistSign;

    @FindBy(xpath = "//span[normalize-space()='Kindle']")
    public WebElement selectKindleBtn;

    public void inputText(String signlogin) {
        signfield.sendKeys(signlogin); }

    public void clickSignLoginButton() {
        signlogBtn.click(); }

    public void inputPassText(String signpass) {
        passfield.sendKeys(signpass); }

    public void clickSignPassButton() {
        signpassBtn.click(); }

    public void mouseOverMenu() {
        Actions act=new Actions(driver);
        act.moveToElement(popupMenu).build().perform();
    }

    public void clickSelectKindleButton() {
        selectKindleBtn.click(); }

    public void clickAddListBookBtn() {
        addbooktolistSign.click(); }

    public void clickPopListButton() {
        popupListbnt.click(); }

}
