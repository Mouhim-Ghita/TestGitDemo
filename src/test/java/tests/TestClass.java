package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.SetupTeardown;



public class TestClass extends SetupTeardown {
   @Test
    public void scenarioVerificationTitre(){
        String title="Annonces au Maroc | Avito.ma";
        // 1 verifier le titre de la page

        HomePage page=new HomePage(driver);
        Assert.assertEquals(page.getTitre(),title);

        //2 verifier le bouton se connecter

        Assert.assertTrue(page.verifierSeconnecter());

    }

    @Test(priority = 1)
    public void scenarioLogin() throws InterruptedException {
        String title="Annonces au Maroc | Avito.ma";
        String email="abcd@gam.com";
        String motDepass="azertyiop";
        //Ouvrir le site
        HomePage page=new HomePage(driver);
        Assert.assertEquals(page.getTitre(),title);

        //Cliquer sur se connecter
        page.cliquerSeConnecter();
        //Entrez faux email et password
        Thread.sleep(50000);
        LoginPage pagelogin=new LoginPage(driver);
        pagelogin.saisirFauxEmailPassword(email,motDepass);
        //cliquer sur se connecter
        pagelogin.seconnecter();

    }
}
