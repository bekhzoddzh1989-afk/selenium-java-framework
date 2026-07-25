package Download_Upload_Actions;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class Download_Intro {
    @Test
    public void Download_Intro() {

        Driver.getDriver().get("https://demoqa.com/upload-download");
        WebElement downloadButton = Driver.getDriver().findElement(By.id("downloadButton"));
        downloadButton.click();

        String path = "/Users/bonuyusupova/Desktop/sampleFile.jpeg";
        File file = new File(path);
        boolean exists = file.exists();
        System.out.println(exists);





    }



}
