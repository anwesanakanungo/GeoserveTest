package constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FrameworkConstants {
    public static final String CONFIG_PROPERTIES_PATH = "src/main/resources/config/config.properties";
    public static final int DEFAULT_WAITING_TIME = 20;
    public static final int RETRY_COUNT = 3;
    public static final String JSON_TEST_DATA = "src/main/resources/jsonfile/testData.json";
    public static final String JSON_TEST_DATA_COTACTUSPAGE = "src/main/resources/jsonfile/contactUsTestData.json";
}
