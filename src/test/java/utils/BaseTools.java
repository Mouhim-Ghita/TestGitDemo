package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTools {

    public BaseTools() {
    }

    public void verifierExistence(WebElement xpath, WebDriver driver, String elementName) {

        try {
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
            wait.until(ExpectedConditions.visibilityOf(xpath));
            System.out.println("element existant: " + elementName);
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
            System.out.println("element abscent: "+elementName);
        }

    }
}
