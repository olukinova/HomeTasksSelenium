package hometask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        //driver.manage().window().maximize();

        WebElement checkBoxBtn = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));

        boolean isSelected = checkBoxBtn.isSelected();

        System.out.println(isSelected);


        if(!isSelected) {
            checkBoxBtn.click();
        }

        isSelected = checkBoxBtn.isSelected();

        System.out.println(isSelected);
        driver.quit();
    }
}
