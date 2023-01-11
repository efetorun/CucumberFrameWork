package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinities {
    Amazonpage amazonpage=new Amazonpage();
    @Given("benutzer geht zu Amazon HauptSeite")
    public void benutzer_geht_zu_amazon_haupt_seite() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonurl"));
    }
    @Then("schreibt Nutella in SerachBox und sucht")
    public void schreibt_nutella_in_serach_box_und_sucht() {
        amazonpage.searchbox.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("testet ob ergebnis der Suchung Nutella enthalt")
    public void testet_ob_ergebnis_der_suchung_nutella_enthalt() {
      String aktuellErgebnisDerSuchung=amazonpage.aramaSonucuElementi.getText();
      String erwartetWort="Nutella";
        Assert.assertTrue(aktuellErgebnisDerSuchung.contains(erwartetWort));
    }
    @Then("mach Webseite zu")
    public void mach_webseite_zu() {
    Driver.closeDriver();
    }
















}
