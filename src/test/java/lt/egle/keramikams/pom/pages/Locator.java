package lt.egle.keramikams.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator {


    public static class Login {
        public static By fieldElPastas = By.xpath("//input[@name='login[username]']");
        public static By fieldSlaptazodis = By.xpath("//input[@name='login[password]']");
        public static By buttonPrisijungti = By.xpath("(//span[contains(text(),'Prisijungti')])[1]");
        public static By firstLineDropdownNuorodos = By.xpath("(//li[@class='greet welcome'])[1]");
        public static By errorMessage = By.xpath("//div[contains(text(),'Neteisingas prisijungimo vardas arba slaptažodis.')]");
        public static By spanLoggedIn = By.xpath("(//span[@class='logged-in'])[1]");
    }

    public static class CommonActions {
        public static By buttonCookiesSutinku = By.xpath("//span[contains(text(),'Sutinku')]");
        public static By buttonNuorodos = By.xpath("//*[contains(text(),'Nuorodos')]");
    }

    public static class ItemSearch {
        public static By textFirstItemInList = By.xpath("//*[@id='layer-product-list']/div[2]/ol/li[1]/div/div[2]/strong/a");
        public static By textMessageNotice = By.xpath("//div[@class='message notice']");

    }

    public static class AddToCart {

        public static By buttonIKrepseliRaudonaRiebiMolioMase = By.xpath("//form[@action='https://keramikams.lt/checkout/cart/add/uenc/aHR0cHM6Ly9rZXJhbWlrYW1zLmx0L2NhdGFsb2dzZWFyY2gvcmVzdWx0Lz9xPVJhdWRvbmErcmllYmkrbW9saW8rbWFzJUM0JTk3Kw%2C%2C/product/5551/']");
        public static By fieldQuantity20Kg = By.xpath("//input[@name='super_group[2180]']");
        public static By fieldQuantity5Kg = By.xpath("//input[@name='super_group[2183]']");
        public static By buttonIKrepseli = By.xpath("//span[contains(text(), 'Į krepšelį')]");
        public static By numberofItemsinBasket = By.xpath("//span[@class='counter-number']");
    }

    public static class SortItems {
        public static By buttonRikiavimas = By.xpath("(//select[@id='sorter'])[1]");
        public static By arrowSetDescending = By.xpath("(//a[@title='Set Descending Direction'])[1]");
        public static By sorterPrice = By.className("price");
        public static By spanSecondItem = By.xpath("(//li[@class='item product product-item nth-child-2n']//a[@href='https://keramikams.lt/limozo-porceliano-mase-liejimui'])[1]");
        public static By spanThirdItem = By.xpath("(//li[@class='item product product-item nth-child-2np1 nth-child-3n']//a[@href='https://keramikams.lt/permatomas-imperatoriskasis-porcelianas-5kg-jade'])[1]");
    }

    public static class Homepage {
        public static By wordClickablePrisijungti = By.xpath("(//a[contains(text(),'Prisijungti')])[1]");
        public static By iconMagnifier = By.xpath("//button[@class='action search']");
        public static By inputSearch = By.xpath("//input[@id='search']");
        public static By buttonPrekiuKatalogas = By.xpath("//a[@title='Prekių katalogas']");

        public static By inputByTitle(String title) {
            return By.xpath(
                    String.format("//a[@title='%s']", title)
            );
        }

        public static By inputByTextInCategory(String categoryName) {
            return By.xpath(
                    String.format("//option[contains(text(), '%s')]", categoryName)
            );
        }
    }

    public class SideBarFilterPage {
        public static By buttonBotz = By.xpath("(//a[@href='https://keramikams.lt/prekiu-katalogas/glazura-keramikai/vokiska-glazura/botz'])[4]");
        public static By sliderPriceStart = By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all' and @style='left: 100%;']");
    }
}
// //a[@class="ui-slider-handle ui-state-default ui-corner-all" and @style="left: 100%;"] start
// //a[@class="ui-slider-handle ui-state-default ui-corner-all" and @style="left: 43.1034%;"] final
