package hometask6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        //driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();

        List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));


        for(int i = 0; i < column.size(); i++) {

            String text = column.get(i).getText();
            if(text.equalsIgnoreCase("51852A")) {
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[1]")).click();
            }
        }

        driver.close();
    }
}
