package CommonTest;

import Pages.HomePage;
import org.junit.Test;

public class HomeTest {
    HomePage home =new HomePage();
     @Test
    public void verifyTheWebPageWithGivenUrl(){
        home.goToPage();
    }
}
