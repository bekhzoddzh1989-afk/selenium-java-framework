package Download_Upload_Actions;

import Utilities.Configuration_Reader;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Actions_Practice {

    @Test
    public void Actions_Practice() {

        Driver.getDriver().get(Configuration_Reader.getProperty("env"));

// Ждем появления кнопки Continue shopping
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        WebElement continueBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(text(),'Continue shopping')]"))
        );

        continueBtn.click();

// Ждем появления элемента "Back to top"
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[@id='navBackToTop']"))
        );

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element).perform();






    }




}
