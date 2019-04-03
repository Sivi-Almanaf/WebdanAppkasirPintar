package StepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Alert;

import static StepDefinition.base.capabilities;
import static StepDefinition.base.takeStepSnapshot;


public class StepDefiniton {

    AndroidDriver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario=scenario;
    }

    @Given("^User berada di halaman pembuka$")
    public void user_berada_di_halaman_pembuka() throws Throwable {
        driver = capabilities();

    }

    @When("^User klik button next$")
    public void user_klik_button_next() throws Throwable {
        driver.findElementById("org.owline.kasirpintar:id/fab").click();
        takeStepSnapshot(scenario, driver);

    }

    @When("^User klik field column Email dan mengisi email$")
    public void user_klik_field_column_Email_dan_mengisi_email() throws Throwable {
        driver.findElementById("org.owline.kasirpintar:id/editEmail").click();
        driver.findElementById("org.owline.kasirpintar:id/editEmail").sendKeys("salmanashahab@gmail.com");
        takeStepSnapshot(scenario, driver);


    }

    @When("^User klik field column passwoord dan mengisi password$")
    public void user_klik_field_column_passwoord_dan_mengisi_password() throws Throwable {
        driver.findElementById("org.owline.kasirpintar:id/editPassword").click();
        driver.findElementById("org.owline.kasirpintar:id/editPassword").sendKeys("qwerty12345");
        takeStepSnapshot(scenario, driver);

    }

    @Then("^User klik button login$")
    public void user_klik_button_login() throws Throwable {
        driver.findElementById("org.owline.kasirpintar:id/buttLogin").click();
        takeStepSnapshot(scenario, driver);
    }

//    @Then("^Tampil ke halaman account$")
//    public void tampil_ke_halaman_account() throws Throwable {
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        driver.findElementById("org.owline.kasirpintar:id/list_pengaturan").isDisplayed();
////        takeStepSnapshot(scenario, driver);
//
//    }

}
