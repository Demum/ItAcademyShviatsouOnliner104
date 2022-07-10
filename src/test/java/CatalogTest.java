import org.junit.Test;

public class CatalogTest extends WebDriverSettings {


    @Test
    public void onlinerSiteCatalogTest() {
        driver.get("https://www.onliner.by/");
        driver.findElement(Locators.catalogLocator).click();

        isDisplayed(Locators.electronikaLocator);

        isDisplayed(Locators.computeryISetyLocator);

        isDisplayed(Locators.bitovayaTehnikaLocator);

        isDisplayed(Locators.stroykaIRemontLocator);

        isDisplayed(Locators.domISadLocator);

        isDisplayed(Locators.avtoIMotoLocator);

        isDisplayed(Locators.krasotaISportLocator);

        isDisplayed(Locators.detyamIMamamLocator);

        isDisplayed(Locators.rabotaIOficeLocator);

        isDisplayed(Locators.edaLocator);


    }




}

