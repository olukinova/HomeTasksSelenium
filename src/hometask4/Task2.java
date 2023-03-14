
package hometask4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0 );

        //WebElement frame = driver.findElement(By.xpath(""));
        WebElement textBox = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));

        textBox.clear();
        textBox.sendKeys("Hello World!");

        driver.switchTo().defaultContent();

        driver.close();
    }
}
