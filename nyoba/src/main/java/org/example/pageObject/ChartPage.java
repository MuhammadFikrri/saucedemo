package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChartPage
{
    public static WebDriver driver;

    public ChartPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    @FindBy(xpath = "//a[.='2']")
    private WebElement chartIcon;

    public void clickChartIcon()
    {
        chartIcon.click();
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement rmvItem1;

    public void clickRmvItem1()
    {
        rmvItem1.click();
    }

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement contShopping;

    public void clickContShopping()
    {
        contShopping.click();
    }

}