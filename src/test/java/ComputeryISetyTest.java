import org.junit.Test;

public class ComputeryISetyTest extends WebDriverSettings {

    @Test
    public void computeryIsetyTest() {

        driver.get(Locators.urlOfOnlinerBy);
        driver.findElement(Locators.catalogLocator).click();
        driver.findElement(Locators.computeryISetyLocator).click();

        isDisplayed(Locators.noutbukiComputeryMonitoryLocator);
        isDisplayed(Locators.komplectuyschieLocator);
        isDisplayed(Locators.hranenieDannihLocator);
        isDisplayed(Locators.setevoeOborudovanieLocator);
    }

}
