package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    //Declaration des XPATHS
    @FindBy(xpath = "//span[text()='Se connecter']")
    WebElement bouttonSeConnecter;

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String getTitre()
    {
        String titre=driver.getTitle();
        return titre;
    }

    public Boolean verifierSeconnecter() {
        return bouttonSeConnecter.isDisplayed();
    }

    public void cliquerSeConnecter() {
        bouttonSeConnecter.click();
    }
}
