package CssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.xpath("//input[@type='text']"));

        email.sendKeys("bogg@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));


        password.sendKeys("hdk23425" + Keys.ENTER);


        WebElement loginButton = driver.findElement(By.xpath("//button[@type="));








    }












}
