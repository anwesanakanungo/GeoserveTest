package randomtestdata;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RandomUtil {

    public static String getNumber() {
        return String.valueOf(FakerUtil.getNumber());
    }

    public static String getFirstName() {
        return FakerUtil.getFirstName();
    }

    public static String getLastName() {
        return FakerUtil.getLastName();
    }

    public static String getEmail() {
        return FakerUtil.getEmail();
    }

    public static String getCity() {
        return FakerUtil.getCity();
    }

    public static String getAddress() {
        return FakerUtil.getAddress();
    }

    public static String getCompany() {
        return FakerUtil.getCompany();
    }

}
