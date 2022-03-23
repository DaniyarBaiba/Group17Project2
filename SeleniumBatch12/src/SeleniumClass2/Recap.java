package SeleniumClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); //open
        WebDriver driver = new ChromeDriver(); //launch the brawser
        driver.get("https://www.facebook.com/"); // open
        driver.manage().window().maximize(); //maximize
        String title = driver.getTitle();
        String expectedTitle = "Facebook - log In or Sign Up"; //value
        if (title.equals(expectedTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");

        }
        driver.quit();

    }
}