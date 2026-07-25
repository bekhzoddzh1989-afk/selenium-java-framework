package Selenium_FinfElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Practice {

   public  static void main(String[] args) {


       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://www.apple.com");

       WebElement element = driver.findElement(By.partialLinkText("Find an Apple"));

       element.click();










    }





}
