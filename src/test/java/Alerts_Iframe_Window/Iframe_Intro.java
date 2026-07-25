package Alerts_Iframe_Window;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Iframe_Intro {

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
        driver.get("https://interactive-examples.mdn.mozilla.net/pages/tabbed/iframe.html");

    }

    @Test
    public void iframe() {

        driver.switchTo().frame("output-iframe");

        WebElement titleElement = driver.findElement(By.xpath("//iframe[@title='Inline Frame Example']"));
        String titleValue = titleElement.getAttribute("title");
        System.out.println(titleValue);
        //driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();





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
