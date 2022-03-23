package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
    public static void main(String[] args) throws InterruptedException {
        /* WebElement?
        anything we see on the web page is considered to be W.E f.e. buttons, textboxes, checkboxes, links
        HTML?
        HyperText MarkUp Language
        What is DOM?
        DOM stands for Document Object Model.It is the browser/s internal
        view of the webpage. Also called Dev tools.
        Document--->can be stored any document such as pdf, excel...
        Object---> any line in HTML is considered as Object
        Model-----> it is just a layout of the HTML
        Locator ---> is an address or a position of an webElement on the web page
        is used to locate or identify webElement on the web page

        8 Locators:
        -ID
        - name
        -TagName
        -Xpath
        -LinkText
        -PartialLinktext
        -CSS classroom
        -classname

        HTML Scripting Meaning:
        purple --tags|| button, input, div
        brown--attribute || name, class, id etc..
        blue--attribute value
         */
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("syntax@adfadf.com");
        driver.findElement(By.id("pass")).sendKeys("whatever");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot password")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
