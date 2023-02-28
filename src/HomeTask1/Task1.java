package HomeTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.crhome.driver", "/Users/olenapopova/IdeaProjects/MyHomeTaskSelenium");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Helen");
        driver.findElement(By.id("customer.lastName")).sendKeys("Martynenko");
        driver.findElement(By.id("customer.address.street")).sendKeys("1234, Johnson drive");
        driver.findElement(By.id("customer.address.city")).sendKeys("Boston");
        driver.findElement(By.id("customer.address.state")).sendKeys("Massachusets");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("858123121236");
        driver.findElement(By.id("customer.ssn")).sendKeys("8956-65-66");
        driver.findElement(By.id("customer.username")).sendKeys("hmartynenko");
        driver.findElement(By.id("customer.password")).sendKeys("12345%%^&%");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345%%^&%");
        driver.quit();

    }
}
