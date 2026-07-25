package Drobdown_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class Dropdown_Intro {

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
        driver.get("https://demoqa.com/select-menu#google_vignette");

    }

    @Test
    public void Dropdown_Intro() {

        WebElement dropdownBox = driver.findElement(By.id("oldSelectMenu"));
        Select dropdown = new Select(dropdownBox);
        dropdown.selectByValue("10");
        String valueTest = dropdown.getFirstSelectedOption().getText();

        System.out.println(valueTest);

        List<WebElement> listOfDropdown = dropdown.getOptions();
        for ( WebElement eachOption : listOfDropdown) {
            System.out.println(eachOption.getText());



        }






    }



    @AfterMethod

    public void tearDownMethod(){
       // driver.close();

    }

    @AfterClass
    public void closeDownClass() {
        //driver.quit();

    }






}
