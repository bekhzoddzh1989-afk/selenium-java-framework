package Selenium_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String nameOfWebsite = driver.getTitle();

        if(nameOfWebsite.contains("Yahoo")){

            System.out.println("The website has  correct Title");

        } else {

            System.out.println("The website has incorrect Title");

        }

        driver.close();






    }







}
