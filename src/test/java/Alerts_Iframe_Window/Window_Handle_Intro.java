package Alerts_Iframe_Window;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WindowType;


public class Window_Handle_Intro {

    WebDriver driver;

    @BeforeClass
    public void setUP() {


        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void setUpMethod() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en-US");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.facebook.com/?locale=en_US");
    }

    @Test
    public void window_Handle_intro() {

        // Главная вкладка
        String facebookWindowHandle = driver.getWindowHandle();

        // Находим ссылку
        WebElement forgotPasswordLink =
                driver.findElement(By.linkText("Forgot password?"));

        // Получаем адрес ссылки
        String url = forgotPasswordLink.getAttribute("href");

        // Открываем новую вкладку
        driver.switchTo().newWindow(WindowType.TAB);

        // Переходим по ссылке в новой вкладке
        driver.get(url);

        // Выводим Handle новой вкладки
        String forgotPasswordWindowHandle = driver.getWindowHandle();
        System.out.println(forgotPasswordWindowHandle);
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
