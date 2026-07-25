package RadioButton_CheckBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.Keys;

public class RadioButton_Practice {


   public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


       driver.get("https://demos.telerik.com/kendo-ui/checkbox/index");

       WebElement rainSensor = driver.findElement(By.id("eq6"));

       if (!rainSensor.isSelected()) {
           rainSensor.sendKeys(Keys.SPACE);
       }










    }






}
