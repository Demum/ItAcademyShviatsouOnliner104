import org.junit.Test;

public class Complectuyschie extends WebDriverSettings{
    @Test
    public void complectuyschieTest(){
        driver.get("https://www.onliner.by/");
        driver.findElement(catalogLocator).click();
        driver.findElement(computeryISetyLocator).click();
        driver.findElement(komplectuyschieLocator).click();

        isDisplayed(nameOfProductRazdelaKomplectuyschieLocator);
        isDisplayed(kolischestvoTovaraRazdelaKomplectuyschieLocator);
        isDisplayed(minCenaTovaraRazdelaKomplectuyschieLocator);


    }

}
