package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefs {
   Amazonpage amazonpage=new Amazonpage();

   @Given("benutzer geht zu amazon hauptSeite")
    public void benutzerGehtZuAmazonHauptSeite() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonurl"));
    }

    @Then("schreibt Nutella in SearchBox und sucht")
    public void schreibtNutellaInSearchBoxUndSucht() {
       amazonpage.searchbox.sendKeys("Nutella"+ Keys.ENTER);
    }

    @And("testet ob ergebnis der Suchung Nutella enthalt")
    public void testetObErgebnisDerSuchungNutellaEnthalt() {
       String aktuellWort=amazonpage.aramaSonucuElementi.getText();
       String erwartetWort="Nutella";
        Assert.assertTrue(aktuellWort.contains(erwartetWort));

    }

    @Then("mach webseite zu")
    public void machWebseiteZu() {
    Driver.closeDriver();
    }

    @Then("schreibt Java in SearchBox und sucht")

    public void schreibtJavaInSearchBoxUndSucht() {
        amazonpage=new Amazonpage();
       amazonpage.searchbox.sendKeys("Java"+Keys.ENTER);
    }

    @Then("schreibt Samsung in SearchBox und sucht")
    public void schreibtSamsungInSearchBoxUndSucht() {
        amazonpage=new Amazonpage();
       amazonpage.searchbox.sendKeys("Samsung" +Keys.ENTER);
    }

    @Then("schreibt {string} in SearchBox und sucht")
    public void schreibtInSearchBoxUndSucht(String suchendesWort) {
        amazonpage=new Amazonpage();
        amazonpage.searchbox.sendKeys(suchendesWort+Keys.ENTER);
    }

    @And("testet ob ergebnis der Suchung {string} enthalt")
    public void testetObErgebnisDerSuchungEnthalt(String erwartendesWort) {
       amazonpage=new Amazonpage();
       String aktuellWort=amazonpage.aramaSonucuElementi.getText();
        Assert.assertTrue(aktuellWort.contains(erwartendesWort));
    }

    @And("{int} minuten wartet")
    public void minutenWartet(int Sekunde) throws InterruptedException {
       Thread.sleep(Sekunde*1000);
    }

    @Given("benutzer geht zu {string} hauptSeite")
    public void benutzerGehtZuHauptSeite(String eingegebeneUrl) {
       Driver.getDriver().get(ConfigReader.getProperty(eingegebeneUrl));
    }

    @Then("tested dass url {string} enthalt")
    public void testedDassUrlEnthalt(String erwartendesWortdesUrls) {
       String aktuellUrl=Driver.getDriver().getCurrentUrl();
       Assert.assertTrue(aktuellUrl.contains(erwartendesWortdesUrls));
    }
}
