package lt.egle.keramikams.pom.pages;

import org.openqa.selenium.By;

public class Locator {


    public class Login {

        public static By wordClickablePrisijungti = By.xpath("(//a[contains(text(),'Prisijungti')])[1]");
        public static By fieldElPastas = By.xpath("//input[@name='login[username]']");
        public static By fieldSlaptazodis = By.xpath("//input[@name='login[password]']");
        public static By buttonPrisijungti = By.xpath("(//span[contains(text(),'Prisijungti')])[1]");
        public static By firstLineDropdownNuorodos = By.xpath("(//li[@class='greet welcome'])[1]");
        public static By errorMessage = By.xpath("//div[contains(text(),'Neteisingas prisijungimo vardas arba slaptažodis.')]");
    }

    public class CommonActions {
        public static By buttonCookiesSutinku = By.xpath("//span[contains(text(),'Sutinku')]");
        public static By buttonNuorodos = By.xpath("//*[contains(text(),'Nuorodos')]");
    }

    public class ItemSearch {

        public static By inputSearch = By.xpath("//input[@id='search']");
        public static By iconSearch = By.xpath("//button[@class='action search']");
        public static By textFirstItemGiven = By.xpath("//a[contains(text(), 'Raudona riebi molio masė')]");
        public static By textMessageNotice = By.xpath("//div[@class='message notice']");
    }

    public class AddToCart {

        public static By buttonIKrepseliRaudonaRiebiMolioMase = By.xpath("//form[@action='https://keramikams.lt/checkout/cart/add/uenc/aHR0cHM6Ly9rZXJhbWlrYW1zLmx0L2NhdGFsb2dzZWFyY2gvcmVzdWx0Lz9xPVJhdWRvbmErcmllYmkrbW9saW8rbWFzJUM0JTk3Kw%2C%2C/product/5551/']");
        public static By fieldQuantity20Kg = By.xpath("//input[@name='super_group[2180]']");
        public static By fieldQuantity5Kg = By.xpath("//input[@name='super_group[2183]']");
        public static By buttonIKrepseli = By.xpath("//span[contains(text(), 'Į krepšelį')]");
        public static By numberofItemsinBasket = By.xpath("//span[@class='counter-number']");
    }

    public class ItemFilter {
        public static By spanPrice = By.xpath("//span[@class='price']");
    }
}

