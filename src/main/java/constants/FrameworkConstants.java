package constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FrameworkConstants {
    public static String CONFIG_PROPERTIES_PATH="src/main/resources/config/config.properties";
    public static int DEFAULT_WAITING_TIME=20;
    public static int RETRY_COUNT=3;
    public static String JSON_TEST_DATA="src/main/resources/jsonfile/testData.json";
}
