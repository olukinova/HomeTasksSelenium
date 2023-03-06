package hometask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        //driver.manage().window().maximize();

       /* List<WebElement> checkAllGroup = driver.findElements(By.cssSelector("input[class='cb1-element']"));

        for(WebElement checkbox: checkAllGroup) {

            boolean isSelected = checkbox.isSelected();

            if(!isSelected) {
                checkbox.click();
            }
        }

        driver.quit();*/

        // OR iterate over the options and select only one box out of 4

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number of option from 1 to 4");

        int optionNum = scan.nextInt();

        WebElement option = null;

        switch(optionNum) {
            case 1:
                option = driver.findElement((By.cssSelector("input[value='Option-1']")));
                break;
            case 2:
                option = driver.findElement((By.cssSelector("input[value='Option-2']")));
                break;
            case 3:
                option = driver.findElement((By.cssSelector("input[value='Option-3']")));
                break;
            case 4:
                option = driver.findElement((By.cssSelector("input[value='Option-4']")));
                break;
        }

                boolean isSelected = option.isSelected();
                if(!isSelected) {
                    option.click();
                }

                isSelected = option.isSelected();


                Thread.sleep(4000);
                driver.quit();



        }
    }

