package HomeTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.crhome.driver", "/Users/olenapopova/IdeaProjects/MyHomeTaskSelenium");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        //driver.manage().window().maximize();
        driver.get("https://facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Helena");
        driver.findElement(By.name("lastname")).sendKeys("Martynenko");
        driver.findElement(By.name("reg_email__")).sendKeys("hmart@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hmart@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("qwerty!245665");
        driver.findElement(By.name("birthday_day")).sendKeys("12");
        driver.findElement(By.name("birthday_month")).sendKeys("Aug");
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}
