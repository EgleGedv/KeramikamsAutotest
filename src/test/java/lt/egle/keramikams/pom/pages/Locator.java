package lt.egle.keramikams.pom.pages;

import org.openqa.selenium.By;

public class Locator {


    public class Login {
        public static By buttonSutinku = By.xpath("//span[contains(text(),'Sutinku')]");
        public static By buttonNuorodos = By.xpath("//*[contains(text(),'Nuorodos')]");
        public static By wordClickablePrisijungti = By.xpath("(//a[contains(text(),'Prisijungti')])[1]");
        public static By fieldElPastas = By.xpath("//input[@name='login[username]']");
        public static By fieldSlaptazodis = By.xpath("//input[@name='login[password]']");
        public static By buttonPrisijungti = By.xpath("(//span[contains(text(),'Prisijungti')])[1]");
        public static By firstLineDropdownNuorodos = By.xpath("(//li[@class='greet welcome'])[1]");
        public static By errorMessage = By.xpath("//div[contains(text(),'Neteisingas prisijungimo vardas arba slaptažodis.')]");
    }
}
////div[@data-bind='html: message.text']