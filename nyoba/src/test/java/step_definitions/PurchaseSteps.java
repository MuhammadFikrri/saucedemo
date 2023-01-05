package step_definitions;

import cucumber.api.java.en.And;
import org.example.pageObject.InventoryPage;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps
{
    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("user sort filter \"(.*)\"")
    public void clickSortFilter1(String filter) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.clickSortFilter(filter);
        Thread.sleep(3000);
    }

    @And("User pick item Sauce Labs Backpack")
    public void clickItemBasket1() throws InterruptedException
    {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickBasket1();
        inventoryPage.clickBasket2();
        Thread.sleep(3000);
    }
}
