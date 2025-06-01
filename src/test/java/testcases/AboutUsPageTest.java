package testcases;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import utils.assertutil.AssertUtils;

@Slf4j
public class AboutUsPageTest extends BaseTest{
    @Test
    public void aboutUsPage(){
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
    String expectedResult= aboutUsPage
            .goTo()
            .getTextAboutUs();
       // Assert.assertEquals("About Us",expectedResult);
        AssertUtils.assertEquals("About Us",expectedResult,"Actual text is equal");
        log.info("Actual text About Us expected text"+expectedResult );
    }

}
