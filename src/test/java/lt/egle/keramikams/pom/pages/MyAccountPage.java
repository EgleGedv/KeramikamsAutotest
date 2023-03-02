package lt.egle.keramikams.pom.pages;

public class MyAccountPage {
    public static String readParagraphKontaktineInformacija() {
        return Common.getElementText(Locator.MyAccount.paragraphKontaktineInformacija);
    }
}
