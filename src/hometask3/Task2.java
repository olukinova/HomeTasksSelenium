package hometask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        //driver.manage().window().maximize();

        List<WebElement> checkAllGroup = driver.findElements(By.cssSelector("input[class='cb1-element']"));

        for(WebElement checkbox: checkAllGroup) {

            boolean isSelected = checkbox.isSelected();

            if(!isSelected) {
                checkbox.click();
            }
        }

        driver.quit();
    }
}
