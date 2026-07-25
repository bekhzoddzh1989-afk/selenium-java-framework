package Drobdown_Intro;

import Utilities.Configuration_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration_Practice {
   public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(Configuration_Reader.getProperty("env"));





    }
}
