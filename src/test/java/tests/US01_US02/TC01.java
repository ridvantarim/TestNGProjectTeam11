package tests.US01_US02;

import org.testng.annotations.Test;
import pages.deneme;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01 {
    deneme homePage;

    @Test
    public void login() {
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        homePage = new deneme();
    }
}
