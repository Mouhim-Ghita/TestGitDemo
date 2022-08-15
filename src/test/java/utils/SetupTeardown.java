package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SetupTeardown {
   public static WebDriver driver;

   @BeforeMethod
   public void launchBrowser()
   {
       String driverChrome = "C:\\drivers\\chrome104\\chromedriver\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver",driverChrome);
       driver= new ChromeDriver();
       driver.get("https://www.avito.ma/");
       System.out.println("le site est bien ouvert");
   }

    @BeforeTest
    public void setup()
    {
        System.out.println("launch browser: Before test");

    }
    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
    @AfterTest
    public void teardown(){

        System.out.println("After test");
    }

}
