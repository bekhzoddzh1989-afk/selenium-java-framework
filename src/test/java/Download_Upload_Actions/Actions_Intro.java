package Download_Upload_Actions;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Intro {

    @Test
    public void intro(){

        Driver.getDriver().get("https://demoqa.com/droppable");

        Actions action = new Actions(Driver.getDriver());
        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        WebElement droppable = Driver.getDriver().findElement(By.id("droppable"));

        action.dragAndDrop(draggable, droppable).perform();


    }



}
