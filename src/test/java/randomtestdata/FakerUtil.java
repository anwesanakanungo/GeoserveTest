package randomtestdata;

import com.github.javafaker.Faker;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
    public final class FakerUtil {

        static Faker faker = new Faker();


        public static int getNumber() {

            return Integer.max(12341,43331);
        }

        public static String getEmail() {

            return String.valueOf(faker.name().firstName() + "@gmail.com");
        }

        public static String getFirstName() {

            return faker.name().firstName();
        }

        public static String getLastName() {

            return faker.name().lastName();
        }

        public static String getCity() {

            return faker.address().city();
        }

       public static String getAddress() {
           return faker.address().streetAddress();
        }
    public static String getCompany() {
        return faker.company().name();
    }

}
