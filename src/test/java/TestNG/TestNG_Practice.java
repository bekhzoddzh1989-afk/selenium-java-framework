package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestNG_Practice {

    WebDriver driver;

    @BeforeClass
    public void setUP() {


        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void setUpMethod() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com");




    }

    @Test
    public void test() {

        String expectedTitle = "Facebook";

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


    }
@Test
public void test2(){
        String expectedURL = "https://www.facebook.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);


}


@AfterMethod

    public void tearDownMethod(){
        driver.close();

}

@AfterClass
    public void closeDownClass() {
        driver.quit();

}







}
