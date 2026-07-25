package Download_Upload_Actions;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Upload_Intro {

    @Test
    public void Upload_Intro() {

        Driver.getDriver().get("https://demoqa.com/upload-download");
        String path = "/Users/bonuyusupova/Desktop/sampleFile.jpeg";
        WebElement uploadButton = Driver.getDriver().findElement(By.id("uploadFile"));


        uploadButton.sendKeys(path);





    }




}
