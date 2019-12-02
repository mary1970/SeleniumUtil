package Pages;

import Common.Driver;
import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {
    private String pageUrl="http://qatest2119.na.edu/";
    private By login=By.cssSelector("#menu-item-103 > a > span");
    public void  goToPage(){
        Driver.getDriver().get(pageUrl);
        Driver.getDriver().findElement(login).click();
    }










   // public By loginPage=By.cssSelector("//*[@id='otherTileText']");
    public By SignIn=By.xpath("//*[@id='i0116']");
    public By userName=By.xpath("//input[@type='email']");
    public By next=By.xpath("//input[@value='Next']");
    public  By firstSign= By.id("idSIButton9");
    public By pass=By.xpath("//input[@name='passwd']");
    public By yesButton = By.xpath("//div[@class='col-xs-24 no-padding-left-right button-container']/div[2]");

    @Override
    public void waitToLoadWebPage() {

    }
}
