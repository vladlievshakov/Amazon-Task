package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstStage {

    public WebDriver driver;
    public FirstStage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


//    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
//    private WebElement findingField;
//
//    public void inputFind(String find) {
//        findingField.sendKeys(find); }

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    private WebElement filterButton;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select/option[6]")
    private WebElement itemBks;

    @FindBy(xpath = "//*[contains(@id, 'nav-search-submit-button')]")
    private WebElement searchBtn;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement findingField;

    @FindBy(xpath = "//*[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
    private WebElement bookNameur;

    @FindBy(xpath = "//*[@class= 'a-size-base a-link-normal s-underline-text s-underline-link-text s-link-style']")
    private WebElement bookAuthor;

    @FindBy(xpath = "//*[@class='a-price']")
    private WebElement bookPrice;

    @FindBy(xpath = "//*[@class='a-badge-text']")
    private WebElement bookBest;

    @FindBy(xpath = "//*[contains(@class, 'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal')]")
    private WebElement selectbookBtn;

    @FindBy(xpath = "//*[contains(@id, 'add-to-cart-button')]")
    private WebElement addtocartBtn;

    @FindBy(xpath = "//*[contains(@id, 'nav-cart-text-container')]")
    private WebElement cartBtn;

    @FindBy(xpath = "//*[@class='a-truncate-cut']")
    private WebElement bookNameCart;

    @FindBy(xpath = "//*[@class='a-size-base sc-product-creator']")
    private WebElement bookAuthorCart;

    @FindBy(xpath = "//*[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    private WebElement bookPriceCart;

    @FindBy(xpath = "//*[@class='a-icon a-icon-addon sc-best-seller-badge']")
    private WebElement bookBestCart;





//    @FindBy(xpath = "//*[contains(@class, 'nav-cart-icon nav-sprite')]")
//    @FindBy(xpath = "//input[@id='searchDropdownDescription']")
//    xpath = "//*[contains(@id, 'identifierId')]"

////span[@class='nav-cart-icon nav-sprite']

    public void clickFilterButton() {
        filterButton.click(); }

    public void clickItemButton() {
        itemBks.click(); }

    public void inputText(String value) {
        findingField.sendKeys(value); }

    public void clickSearchButton() {
        searchBtn.click(); }

    public String getBookName() {
        String bookName = bookNameur.getText();
        return bookName; }

    public String getBookAuthor() {
        String bookAuthorSearch = bookAuthor.getText();
        return bookAuthorSearch; }

    public String getBookPrice() {
        String bookPriceSearch = bookPrice.getText();
        return bookPriceSearch; }

    public String getBookBest() {
        String bookBestSearch = bookBest.getText();
        return bookBestSearch; }

    public void clickSelectBook() {
        selectbookBtn.click(); }

    public void clickAddToCart() {
        addtocartBtn.click(); }

    public void clickCartButton() {
        cartBtn.click(); }

    public String getBookNameCart() {
        String bookNameInCart = bookNameCart.getText();
        return bookNameInCart; }

    public String getBookAuthorCart() {
        String bookAuthorInCart = bookAuthorCart.getText();
        return bookAuthorInCart; }

    public String getBookPriceCart() {
        String bookPriceInCart = bookPriceCart.getText();
        return bookPriceInCart; }

    public String getBookBestCart() {
        String bookBestInCart = bookBestCart.getText();
        return bookBestInCart; }

}



//        Select filterButton = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
//        filterButton.selectByValue("search-alias=stripbooks-intl-ship");