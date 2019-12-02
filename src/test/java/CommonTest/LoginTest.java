package CommonTest;

import Common.Driver;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;


public class LoginTest {
    LoginPage login = new LoginPage();

    @Test
    public void verifyGoingToPage() {
        login.goToWebPage();
    }

    @Test
    public void verifyMaxWindow() {
        login.windowMaximizing();
    }

    @Test
    public void verifyTheLoginUsername() throws InterruptedException {

        login.enterUsername("skaya@na.edu");
        login.clickTheNextButton(By.xpath("//div[@class='col-xs-24 no-padding-left-right button-container']/div/input"));
        Thread.sleep(2000);
        login.enterPass("Deb@65500");
        Thread.sleep(2000);
        login.clickTheSignIn(By.xpath("//div[@class='col-xs-24 no-padding-left-right button-container']/div[1]"));
        Thread.sleep(2000);
        login.clickTheYesButton(By.xpath("//div[@class='col-xs-24 no-padding-left-right button-container']/div[2]"));
        Thread.sleep(2000);
        }

    }

