package Drobdown_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class WebTable_Intro {

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
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

    }

    @Test
    public void WebTable_Intro() {

        WebElement table = driver.findElement(By.xpath("//table[@id='customers'"));
        String str = table.getText();
        System.out.println(str);




    }


    @AfterMethod

    public void tearDownMethod(){
        //driver.close();

    }

    @AfterClass
    public void closeDownClass() {
        //driver.quit();

    }










}
