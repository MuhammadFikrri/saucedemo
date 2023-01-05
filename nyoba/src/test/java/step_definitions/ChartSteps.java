package step_definitions;

import cucumber.api.java.en.And;
import org.example.pageObject.ChartPage;
import org.example.pageObject.InventoryPage;
import org.openqa.selenium.WebDriver;

public class ChartSteps
{
    private WebDriver webDriver;

    public ChartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click the chart icon")
    public void clickChartIcon1() throws InterruptedException
    {
        ChartPage chartPage = new ChartPage(webDriver);
        chartPage.clickChartIcon();
        Thread.sleep(3000);
        chartPage.clickRmvItem1();
        Thread.sleep(3000);
        chartPage.clickContShopping();
        Thread.sleep(3000);
    }
}
