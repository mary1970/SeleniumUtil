package Utils;

import Common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtil {
    public void  gettingNewDriver ( String pageUrl){
        Driver.getDriver().get(pageUrl);
    }
    public WebElement findElement(By locator){

        return Driver.getDriver().findElement(locator);
    }
    public void newDriverGetting(String urlPage){
        Driver.getDriver().get(urlPage);
    }
    public void sendKeys(By locator,String username){
        clear(locator);
        Driver.getDriver().findElement(locator).sendKeys(username);
    }
    public void click(By locator){
        Driver.getDriver().findElement(locator);
    }
    public void  clear(By locator){
        findElement(locator).clear();
    }
    public void sendingKeys(By locator,String password){
        Driver.getDriver().findElement(locator).sendKeys(password);
    }
    public void clicking(By locator)
    {
       Driver.getDriver().findElement(locator).click();
    }
    public void maximizingWindow(){
        Driver.getDriver().manage().window().maximize();
    }
}
