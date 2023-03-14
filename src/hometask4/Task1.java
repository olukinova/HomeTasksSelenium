package hometask4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.xpath("//button[text() = 'Start']"));
        startButton.click();

        WebElement finish= driver.findElement(By.xpath("//div[@id='finish']"));
        finish.click();

        String welcomeMessage = driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        System.out.println("Text displayed on the page: " + welcomeMessage);

        driver.close();
    }
}
