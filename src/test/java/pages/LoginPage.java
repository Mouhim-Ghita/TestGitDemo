package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTools;

public class LoginPage extends BaseTools {
    // page de login
    @FindBy(name ="E-mail")
    WebElement champsEmail;
    @FindBy(name="Mot de passe")
    WebElement champsMDP;
    @FindBy(xpath ="//button[text()='Se connecter']")
    WebElement bouttonSeConnecter;
    @FindBy(xpath = "//h4[contains(text(),'Connexion')]")
    WebElement titrePageConnexion;
    @FindBy(xpath = "//a[contains(text(),'inscrire gratuitement')]")
    WebElement lienInscription;

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void saisirFauxEmailPassword(String email,String mdp)
    {
        System.out.println("saisi de login:"+ email);
        champsEmail.sendKeys(email);
        System.out.println("saisi de mot de pass"+ mdp);
        champsMDP.sendKeys(mdp);

    }


    public void seconnecter() {
        System.out.println("cliquer sur le bouton se connecter");
        bouttonSeConnecter.click();
    }

    public Boolean VerifierTitreConnexion(String titreConnexion) {
        System.out.println("Verifier titre Connexion");
        if(titrePageConnexion.getText().equals(titreConnexion))
        {
            System.out.println("le titre OK");
            return true;
        }
        else {
            System.out.println("le titre KO");
            return false;
        }
    }

    public void cliquerSinscrire() {
        System.out.println("cliquer sur s'inscrire");
        verifierExistence(lienInscription,driver,"Lien d'inscription");
        lienInscription.click();
    }
}
