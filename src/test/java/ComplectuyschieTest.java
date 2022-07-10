import org.junit.Test;

public class ComplectuyschieTest extends WebDriverSettings{
    @Test
    public void complectuyschieTest(){
        driver.get(Locators.urlOfOnlinerBy);
        driver.findElement(Locators.catalogLocator).click();
        driver.findElement(Locators.computeryISetyLocator).click();
        driver.findElement(Locators.komplectuyschieLocator).click();

        isDisplayed(Locators.nameOfProductRazdelaKomplectuyschieLocator);
        isDisplayed(Locators.kolischestvoTovaraRazdelaKomplectuyschieLocator);
        isDisplayed(Locators.minCenaTovaraRazdelaKomplectuyschieLocator);


    }

}
