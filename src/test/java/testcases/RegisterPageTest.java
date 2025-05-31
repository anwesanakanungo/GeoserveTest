package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pojo.Register;

public class RegisterPageTest extends BaseTest{
    @Test
    public void testRegisterPage(){
        Register register = Register.builder()
                .setUsername("abcd")
                .setEmailaddress("test@gmail.com")
                .setPassword("abcd")
                .build();
    RegisterPage registerPage = new RegisterPage(driver);
    registerPage.goTo("https://askomdch.com/account/");
    registerPage.registerUser(register);
    registerPage.loginToApp(register);
    Assert.assertTrue(registerPage.isDisplayed());
}
}
