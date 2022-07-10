import org.junit.Test;

public class Complectuyschie extends WebDriverSettings{
    @Test
    public void complectuyschieTest(){
        driver.get("https://www.onliner.by/");
        driver.findElement(Locators.catalogLocator).click();
        driver.findElement(Locators.computeryISetyLocator).click();
        driver.findElement(Locators.komplectuyschieLocator).click();

        isDisplayed(Locators.nameOfProductRazdelaKomplectuyschieLocator);
        isDisplayed(Locators.kolischestvoTovaraRazdelaKomplectuyschieLocator);
        isDisplayed(Locators.minCenaTovaraRazdelaKomplectuyschieLocator);


    }

}
