package Selenium_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigation {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");



        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        driver.navigate().to("https://www.apple.com");

        String websiteName = driver.getTitle();


        System.out.println(websiteName);


        String ourWebsiteURL = driver.getCurrentUrl();
        System.out.println(ourWebsiteURL);

        driver.close();






    }



}
