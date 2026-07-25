package RadioButton_CheckBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class FindElements_Practice {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com");

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        for (WebElement eachlink : links) {

            System.out.println("Each Link in the Web Page : " + eachlink.getText());
        }

        System.out.println(links.size());















    }




}
