import org.junit.Test;

public class CatalogTest extends WebDriverSettings {


    @Test
    public void onlinerSiteCatalogTest() {
        driver.get("https://www.onliner.by/");
        driver.findElement(catalogLocator).click();

        isDisplayed(electronikaLocator);

        isDisplayed(computeryISetyLocator);

        isDisplayed(bitovayaTehnikaLocator);

        isDisplayed(stroykaIRemontLocator);

        isDisplayed(domISadLocator);

        isDisplayed(avtoIMotoLocator);

        isDisplayed(krasotaISportLocator);

        isDisplayed(detyamIMamamLocator);

        isDisplayed(rabotaIOficeLocator);

        isDisplayed(edaLocator);


    }




}

