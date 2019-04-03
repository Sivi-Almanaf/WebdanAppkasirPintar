package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.QAEngineerFeed;
import pages.QAEngineerpage;
import test.QAEngineer;

public class QAEngineersteps extends ScenarioSteps {

    QAEngineerpage QAEpage;
    QAEngineerFeed QAEFeed;
    public void openWebKasir() {
        QAEpage.open();
    }

    public void tombolKarir() {
     QAEpage.fungsiTombolKarir();
    }

    public void TampilanHalamanKarir() {
        QAEFeed.isHeaderDisplayed();
        QAEFeed.isFeedDisplayed();
    }

//    public void scrollDown() throws InterruptedException {
//
//        QAEpage.ByPixel();
//    }
    public void tombolCariPosisi(String Input) {

        QAEpage.fungsiCariPosisi(Input);
    }

    public void divisiTeknologi() {

        QAEpage.fungsiCariDivisi();
    }

    public void tombolCariJob() {

        QAEpage.fungsiTombolCari();
    }
    public void tunggu() {
        QAEpage.waktuTunggu();
    }
    public void listPekerjaan(){

    }
}

