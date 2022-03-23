package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTask1 {
    public static void main(String[] args) {
        /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
         fill out the form
         click on register
         close the browser*/
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Aizhan");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kulmagambetova");
        driver.findElement(By.id("customer.address.street")).sendKeys("Kabanbay batyra 60");
        driver.findElement(By.id("customer.address.city")).sendKeys("Astana");
        driver.findElement(By.id("customer.address.state")).sendKeys("Va");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22030");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("357195715487485");
        driver.findElement(By.id("customer.ssn")).sendKeys("Ashkdhf5875");
        driver.findElement(By.id("customer.username")).sendKeys("aizhan");
        driver.findElement(By.id("customer.password")).sendKeys("7875SESRklklk");
        driver.findElement(By.id("repeatedPassword")).sendKeys("7875SESRklklk");
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
