package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;
    public static WebDriver driverK;

    public static WebDriver getDriver() {
        if (driver == null) {
           setUpDriver();
        }
        return driver;

    }

//    public static WebDriver gettingDriver() {
//        if (driverK == null) {
//            setUpDriver();
//            return driverK;
//        }
//        return driverK;
//    }

    public static void setUpDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

    }
    public static void close(){
        if(driverK!=null){
            driverK.quit();
            driverK=null;
        }
    }
}
