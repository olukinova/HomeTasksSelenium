package HomeTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.crhome.driver", "/Users/olenapopova/IdeaProjects/MyHomeTaskSelenium");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        //driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        driver.findElement(By.xpath("//input[contains(@placeholder, \"Please enter your Message\")]")).sendKeys("This is my message");
        driver.findElement(By.xpath("//button[text()=\"Show Message\"]")).click();
        driver.findElement(By.xpath("//input[contains(@id, \"sum1\")]")).sendKeys("10");
        driver.findElement(By.xpath("//input[contains(@id, \"sum2\")]")).sendKeys("15");

        driver.findElement(By.xpath("//button[contains(@onclick, \"return total()\")]")).click();

        WebElement getTotalButton = driver.findElement(By.xpath("//button[contains(@onclick, \"return total()\")]"));
        System.out.println(getTotalButton.getAttribute("type"));
    }
}
