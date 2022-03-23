package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListStage {

    public WebDriver driver;
    public ListStage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//a[@id='itemName_I253QWKXIQ03ID']")
    private WebElement listbookName;

    @FindBy(xpath = "//span[@id='item-byline-I253QWKXIQ03ID']")
    private WebElement listbookAuthor;

    @FindBy(xpath = "//span[@class='a-color-price itemUsedAndNewPrice']")
    private WebElement listbookPrice;

    @FindBy(xpath = "//span[@class='a-badge-text']")
    private WebElement listbookBest;

    public String getListBookName() {
        String listinbookName = listbookName.getText();
        return listinbookName; }

    public String getListBookAuthor() {
        String listinbookAuthor = listbookAuthor.getText();
        return listinbookAuthor; }

    public String getListBookPrice() {
        String listinbookPrice = listbookPrice.getText();
        return listinbookPrice; }

    public String getListBookBest() {
        String listinbookBest = listbookBest.getText();
        return listinbookBest; }

}
