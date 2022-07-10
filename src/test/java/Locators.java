import org.openqa.selenium.By;

public class Locators {
  public static final  By catalogLocator = By.xpath("//a[contains(text(), 'Каталог')][1]");
  public static final   By electronikaLocator = By.xpath("//span[contains(text(), 'Электроника')] ");
  public static final   By computeryISetyLocator = By.xpath("//span[contains(text(),'Компьютеры и')] [contains(text(),'сети')]");
  public static final   By bitovayaTehnikaLocator = By.xpath("//span[contains(text(),'Бытовая техника')]");
  public static final   By stroykaIRemontLocator = By.xpath("//span[contains(text(),'Стройка и')][contains(text(),'ремонт')]");
  public static final   By domISadLocator = By.xpath("//span[contains(text(),'Дом и')][contains(text(),'сад')]");
  public static final   By avtoIMotoLocator = By.xpath("//span[contains(text(),'Авто и')][contains(text(),'мото')]");
  public static final   By krasotaISportLocator = By.xpath("//span[contains(text(),'Красота и')][contains(text(),'спорт')]");
  public static final   By detyamIMamamLocator = By.xpath("//span[contains(text(),'Детям и')][contains(text(),'мамам')]");
  public static final   By rabotaIOficeLocator = By.xpath("//span[contains(text(),'Работа и')][contains(text(),'офис')]");
  public static final   By edaLocator = By.xpath("//span[contains(text(),'Еда')]");
  public static final   By noutbukiComputeryMonitoryLocator = By.xpath("//div[contains(text(),'Ноутбуки, компьютеры, мониторы ')]");
  public static final   By komplectuyschieLocator = By.xpath("//div[contains(text(),'Комплектующие')]");
  public static final   By hranenieDannihLocator = By.xpath("//div[contains(text(),'Хранение данных')]");
  public static final   By setevoeOborudovanieLocator = By.xpath("//div[contains(text(),'Сетевое оборудование')]");
  public static final   By nameOfProductRazdelaKomplectuyschieLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']/..//span[@class='catalog-navigation-list__dropdown-title']");
  public static final   By kolischestvoTovaraRazdelaKomplectuyschieLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']//..//span[@class='catalog-navigation-list__dropdown-description' and contains (text(), 'товар')] ");
  public static final   By minCenaTovaraRazdelaKomplectuyschieLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']//..//span[@class='catalog-navigation-list__dropdown-description' and contains (text(), 'р')]");
}
