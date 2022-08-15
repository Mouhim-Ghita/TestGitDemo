package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTools;

import java.time.Clock;
import java.time.Duration;

public class InscriptionPage extends BaseTools {
    @FindBy(id = "name")
    WebElement champsNom;
    @FindBy(id="email")
    WebElement champsMail;
    @FindBy(xpath = "//button[contains(text(),'Créer un compte')]")
    WebElement boutonInscription;
    @FindBy(xpath = "//span[contains(text(),'Veuillez Sélectionner une ville')]")
    WebElement messageErreur;
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement boutonCheckbox;

    WebDriver driver;

    public InscriptionPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void remplirFormulaire(String nom,String mail)
    {

        System.out.println("Remplir le formulaire");
        verifierExistence(champsNom,driver,"champs nom");
        champsNom.sendKeys(nom);
        verifierExistence(champsNom,driver,"champs mail");
        champsMail.sendKeys(mail);
    }
    public void cliquerInscription()
    {
        System.out.println("Valider l'inscription");
        boutonInscription.click();
    }
}
