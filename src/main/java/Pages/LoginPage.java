package Pages;

import Common.Driver;
import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends PageBase {
    private String urlPage="https://login.microsoftonline.com/";
    public By SignIn=By.xpath("//div[@class='col-xs-24 no-padding-left-right button-container']/div[1]");
    public By userName=By.xpath("//input[@type='email']");
    public By pass=By.xpath("//input[@name='passwd']");
    public By yesButton = By.xpath("//div[@class='col-xs-24 no-padding-left-right button-container']/div[2]");
    public By next=By.xpath("//div[@class='col-xs-24 no-padding-left-right button-container']/div/input");


    public void goToWebPage() {

       // Driver.gettingDriver().get(urlPage);
    seleniumUtil.newDriverGetting(urlPage);
    }
    public void enterUsername(String name) throws InterruptedException {
        //Driver.gettingDriver().manage().window().maximize();
        // Driver.gettingDriver().findElement(userName).sendKeys("skaya@na.edu", Keys.ENTER);

        seleniumUtil.sendKeys(userName, name);
    }
    public void enterPass(String passwrd) {
        //     Driver.gettingDriver().findElement(pass).sendKeys("Deb@65500", Keys.ENTER);
        seleniumUtil.sendKeys(pass, passwrd);
    }
    public void clickTheSignIn(By locator) {
        //        Driver.gettingDriver().findElement(SignIn).click();
        seleniumUtil.findElement(SignIn).click();
    }
    public void clickTheYesButton(By locator)throws InterruptedException{
//        Driver.gettingDriver().findElement(yesButton).click();
        seleniumUtil.findElement(yesButton).click();
        Thread.sleep(2000);
    }
    public void clickTheNextButton(By locator){
        seleniumUtil.findElement(next).click();
    }
    public void windowMaximizing(){
        seleniumUtil.maximizingWindow();
    }


    @Override
    public void waitToLoadWebPage() {

    }
}
