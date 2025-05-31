package testcases;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;
@Slf4j
public class AboutUsPageTest extends BaseTest{
    @Test
    public void aboutUsPage(){
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
    String expectedResult= aboutUsPage
            .goTo()
            .getTextAboutUs();
        Assert.assertEquals("About Us",expectedResult);
        log.info("Actual text About Us expected text"+expectedResult );
    }

}
