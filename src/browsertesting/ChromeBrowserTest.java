package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();      // Setup Chrome browser
        // Open the given URL in Chrome browser
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Get the title of the page
        System.out.println(driver.getTitle());
        // Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Get page source
        System.out.println("Page source: " + driver.getPageSource());
        // Find the email field element
        driver.findElement(By.id("Email")).sendKeys("prime1234@gmail.com");
        // Type the password in the element
        driver.findElement(By.id("Password")).sendKeys("pswd1234");
        // Close the browser
        driver.close();
    }
}
