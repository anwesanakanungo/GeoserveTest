package testcases;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import randomtestdata.RandomUtil;

@Epic("ECommerce Test")
@Feature("Random data test")
public class TestRandomData {
    @Test
    public void test1() {
        System.out.println(RandomUtil.getFirstName());
        System.out.println(RandomUtil.getLastName());
        System.out.println(RandomUtil.getAddress());
        System.out.println(RandomUtil.getCity());
        System.out.println(RandomUtil.getEmail());
        System.out.println(RandomUtil.getCompany());
        System.out.println(RandomUtil.getNumber());
    }
}
