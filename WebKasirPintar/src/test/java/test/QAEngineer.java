package test;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
//import Steps.QAEngineersteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.QAEngineersteps;

public class QAEngineer extends SerenityStory {
    @Steps
    QAEngineersteps QAE;

    @Given("I open kasirpintar homepage")
    public void homePage(){
        QAE.openWebKasir();
    }


    @When("I click button 'karir'")
    public void buttonKarir() {
        QAE.tombolKarir();
        QAE.tunggu();
    }

    @When("I fill Quality Assurance Engineer in column field 'cari posisi'")

    public void fillCariPosisi(String Input) {

        QAE.tombolCariPosisi(Input);
    }
//    @When("I scroll down page")
//    public void scrollKebawah() throws InterruptedException {
//        QAE.scrollDown();
//    }

    public void tombolCariPosisi(String Input) {
        QAE.tombolCariPosisi(Input);
    }


    @When("I choose Technology in scroll bar of 'Divisi'")
    public void scroolBarTechDivision() {

        QAE.divisiTeknologi();
    }

    @When("I Click Button 'Cari'")
    public void tombolCari() {
        QAE.tombolCariJob();
    }

    @Then("I got list of Quality Assurance Engineer positions")
    public void QAEngineerposititions(){
        QAE.listPekerjaan();
    }
}