import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public boolean isDisplayed(By locator) {
        try {
            Assert.assertTrue(driver.findElement(locator).isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("Элемент: " + locator + "На странице не найден");
            return false;
        }
        return true;
    }

    public WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void close() {
        driver.quit();
    }

}