package Java_Faker;

import Utilities.Configuration_Reader;
import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Driver_Practice {

    @Test
    public void practice(){

        Driver.getDriver().get(Configuration_Reader.getProperty("env"));





    }


}
