import org.junit.Test;

public class ComputeryISety extends WebDriverSettings {

    @Test
    public void computeryIsetyTest() {

        driver.get("https://www.onliner.by/");
        driver.findElement(catalogLocator).click();
        driver.findElement(computeryISetyLocator).click();

        isDisplayed(noutbukiComputeryMonitoryLocator);
        isDisplayed(komplectuyschieLocator);
        isDisplayed(hranenieDannihLocator);
        isDisplayed(setevoeOborudovanieLocator);
    }

}
