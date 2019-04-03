package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class QAEngineerpage extends PageObject {

    @FindBy(xpath = "/html/body/footer/div/div[1]/div[3]/div/ul/li[2]/a")
    WebElement tombolKarir;
    public void fungsiTombolKarir() {
        tombolKarir.click();
    }

    @FindBy(id = "posisi")
    WebElement cariPosisi;
    public void fungsiCariPosisi(String input) {
        cariPosisi.sendKeys("Quality Assurance Engineer");

    }
//    public void fieldColumnCariPosisi() {
//        cariPosisi.click();
//    }

    @FindBy(id = "divisi")
    WebElement cariDivisi;
    public void fungsiCariDivisi() {
        cariDivisi.click();
    }

    @FindBy(id = "cari")
    WebElement tombolcari;
    public void fungsiTombolCari() {
        tombolcari.click();
    }

    @FindBy(xpath = "//*[@id=\"lihat_video\"]/div/div")
    WebElement listPekerjaaan;
    public void pekerjaan() {
        listPekerjaaan.isDisplayed();
    }

//    public void ByPixel() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().window().maximize();
////        driver.get("https://kasirpintar.co.id/careers");
//        Thread.sleep(5000);
//        js.executeScript("window.scrollBy(0, 400)");
////        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    }

    public void waktuTunggu() {
//        System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

}


}

