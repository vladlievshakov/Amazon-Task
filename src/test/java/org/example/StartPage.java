package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class StartPage {

    public static WebDriver driver;
    public static FirstStage firstStage;
    public static BookStage bookStage;
    public static SignStage signStage;
    public static ListStage listStage;
    public static Action action;

    @BeforeClass
    public static void setup() {
//определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        firstStage = new FirstStage(driver);
        bookStage = new BookStage(driver);
        signStage = new SignStage(driver);
        listStage = new ListStage(driver);
        //создание экземпляра драйвера
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("page"));
    }

    @Test
    public void startPage() {

//        firstStage.inputFind(ConfProperties.getProperty("find"));
        firstStage.clickFilterButton();
        firstStage.clickItemButton();
        firstStage.inputText(ConfProperties.getProperty("value"));
        firstStage.clickSearchButton();

        String booknamefind = firstStage.getBookName();
        String bookauhtorfind = firstStage.getBookAuthor();
        String bookpricefind = firstStage.getBookPrice();

        String newbookpricefind = bookpricefind.replaceAll("\n",".");

        String bookbestfind = firstStage.getBookBest();

        firstStage.clickSelectBook();
        bookStage.clickAddlistButton();

        signStage.inputText(ConfProperties.getProperty("signlogin"));
        signStage.clickSignLoginButton();
        signStage.inputPassText(ConfProperties.getProperty("signpass"));
        signStage.clickSignPassButton();

//        signStage.clickSelectKindleButton();

        signStage.clickAddListBookBtn();
//        driver.switchTo().frame(0);
        bookStage.clickClosePopListBtn();

//        signStage.mouseOverMenu();
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        signStage.clickPopListButton();

        String booknamelist = listStage.getListBookName();
        String bookauthorlist = listStage.getListBookAuthor();

        String onebookauthorlist = bookauthorlist.replaceAll("by ", "");
        String secondbookauthorlist = onebookauthorlist.replace(" (Paperback)", "");

        String bookpricelist = listStage.getListBookPrice();
        String bookbestlist = listStage.getListBookBest();


        System.out.println(booknamefind);
        System.out.println(bookauhtorfind);
        System.out.println(newbookpricefind);
        System.out.println(bookbestfind);
        System.out.println(booknamelist);
        System.out.println(secondbookauthorlist);
        System.out.println(bookpricelist);
        System.out.println(bookbestlist);

        Assert.assertEquals(booknamefind, booknamelist);
        Assert.assertEquals(bookauhtorfind, secondbookauthorlist);
        Assert.assertEquals(newbookpricefind, bookpricelist);
        Assert.assertEquals(bookbestfind, bookbestlist);


//        firstStage.clickAddToCart();
//        firstStage.clickCartButton();
//        String booknamecart = firstStage.getBookNameCart();
//        String bookauthorcart = firstStage.getBookAuthorCart();
//        String bookpricecart = firstStage.getBookPriceCart();
//
////        String newbookpricecart = bookpricecart.replace('/', Empty);
////        String nnewbookpricecart = newbookpricecart.replace('n', '.');
//
//        String bookbestcart = firstStage.getBookBestCart();
//
//        Assert.assertEquals(booknamefind, booknamecart);
////        Assert.assertEquals(bookauhtorfind, bookauthorcart);
//        Assert.assertEquals(bookpricefind, bookpricecart);
//        Assert.assertEquals(bookbestfind, bookbestcart);

    }
}


