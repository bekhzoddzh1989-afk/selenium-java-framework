package Alerts_Iframe_Window;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class Alerts_Intro {

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
        driver.get("http://testpages.herokuapp.com/styled/alerts/alert-test.html");

    }

    @Test
    public void alertTest() throws InterruptedException {

        WebElement informationAlert = driver.findElement(By.xpath("//button[@id='alertexamples']"));

        informationAlert.click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(2000);

        alert.accept();



    }

    @Test
    public void alertTest2() throws InterruptedException {

        WebElement confirmationAlert = driver.findElement(By.id("confirmexample"));

        ((JavascriptExecutor) driver).executeScript(

                "arguments[0].scrollIntoView({block: 'center'});",

                confirmationAlert

        );

        Thread.sleep(1000);

        confirmationAlert.click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(2000);

        alert.dismiss();



    }

    @Test

    public void alertTest3() throws InterruptedException {

        WebElement promptAlert = driver.findElement(By.id("promptexample"));

        ((JavascriptExecutor) driver).executeScript(

                "arguments[0].scrollIntoView({block: 'center'});",

                promptAlert

        );

        Thread.sleep(3000);

        promptAlert.click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(3000);

        alert.sendKeys("Hello Students");
        alert.accept();
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
