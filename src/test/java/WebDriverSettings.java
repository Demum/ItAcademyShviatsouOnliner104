import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    By catalogLocator = By.xpath("//a[contains(text(), 'Каталог')][1]");
    By electronikaLocator = By.xpath("//span[contains(text(), 'Электроника')] ");
    By computeryISetyLocator = By.xpath("//span[contains(text(),'Компьютеры и')] [contains(text(),'сети')]");
    By bitovayaTehnikaLocator = By.xpath("//span[contains(text(),'Бытовая техника')]");
    By stroykaIRemontLocator = By.xpath("//span[contains(text(),'Стройка и')][contains(text(),'ремонт')]");
    By domISadLocator = By.xpath("//span[contains(text(),'Дом и')][contains(text(),'сад')]");
    By avtoIMotoLocator = By.xpath("//span[contains(text(),'Авто и')][contains(text(),'мото')]");
    By krasotaISportLocator = By.xpath("//span[contains(text(),'Красота и')][contains(text(),'спорт')]");
    By detyamIMamamLocator = By.xpath("//span[contains(text(),'Детям и')][contains(text(),'мамам')]");
    By rabotaIOficeLocator = By.xpath("//span[contains(text(),'Работа и')][contains(text(),'офис')]");
    By edaLocator = By.xpath("//span[contains(text(),'Еда')]");
    By noutbukiComputeryMonitoryLocator = By.xpath("//div[contains(text(),'Ноутбуки, компьютеры, мониторы ')]");
    By komplectuyschieLocator = By.xpath("//div[contains(text(),'Комплектующие')]");
    By hranenieDannihLocator = By.xpath("//div[contains(text(),'Хранение данных')]");
    By setevoeOborudovanieLocator = By.xpath("//div[contains(text(),'Сетевое оборудование')]");

   By nameOfProductRazdelaKomplectuyschieLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']/..//span[@class='catalog-navigation-list__dropdown-title']");
        By kolischestvoTovaraRazdelaKomplectuyschieLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']//..//span[@class='catalog-navigation-list__dropdown-description' and contains (text(), 'товар')] ");
    By minCenaTovaraRazdelaKomplectuyschieLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']//..//span[@class='catalog-navigation-list__dropdown-description' and contains (text(), 'р')]");





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