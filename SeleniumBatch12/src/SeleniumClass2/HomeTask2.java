package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTask2 {
    public static void main(String[] args) throws InterruptedException{
        /*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
         */
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Создать новый аккаунт")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Aizhan");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Kulmagambetova");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("aijeke_91");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("PIO8989kjl");

        driver.quit();



    }
}

