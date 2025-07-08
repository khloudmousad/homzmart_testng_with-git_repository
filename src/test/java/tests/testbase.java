package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class testbase {
    WebDriver driver;
    @BeforeMethod

    public void beforemethod()
    {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("https://homzmart.com/en");


    }




    @AfterMethod
    public void aftermethod()
    {
        //driver.quit();
    }



}
