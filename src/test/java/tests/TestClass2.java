package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InscriptionPage;
import pages.LoginPage;
import utils.SetupTeardown;

public class TestClass2 extends SetupTeardown {
    @Test
    public void scenarioCreationCompte() throws InterruptedException {
        String title="Annonces au Maroc | Avito.ma";
        String titreconnexion="Connexion";
        String nom="Ghita";
        String email="test@gmail.com";
        //Ouvrir le site
        HomePage page=new HomePage(driver);
        Assert.assertEquals(page.getTitre(),title);

        //Cliquer sur se connecter
        page.cliquerSeConnecter();
        Thread.sleep(50000);
        //vérifier affichage de titre <<Connexion>>
        LoginPage pageLogin=new LoginPage(driver);
        Assert.assertTrue(pageLogin.VerifierTitreConnexion(titreconnexion));
        //cliquer sur s'inscrire gratuitement
        Thread.sleep(50000);
        pageLogin.cliquerSinscrire();
        //remplir le formulaire d'inscription
        InscriptionPage inscriptionPage=new InscriptionPage(driver);
        inscriptionPage.remplirFormulaire(nom,email);
        //valider le formulaire
        inscriptionPage.cliquerInscription();


    }

}
