package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QAEngineerFeed extends PageObject {

//    @FindBy(className = "wellcome-heading")
    @FindBy(xpath = "//*[@id=\"harga\"]/div/div/div[1]")
    WebElement contentFeed;
    public void isFeedDisplayed() {
        Assert.assertTrue(contentFeed.isDisplayed());
    }

//    @FindBy(className = "row align-items-center")
//    WebElement headerNavigation;
//    public void isHeaderDisplayed() {
//        Assert.assertTrue(headerNavigation.isDisplayed());
//        element(headerNavigation).shouldBeVisible();
//    }

    @FindBy(className = "//*[@id=\"harga\"]/div/div/div[1]")
    WebElement headerNavigation;
    public void isHeaderDisplayed() {
        Assert.assertTrue(headerNavigation.isDisplayed());
        element(headerNavigation).shouldBeVisible();

    }


}
