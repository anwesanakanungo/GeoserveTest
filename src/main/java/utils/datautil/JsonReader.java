package utils.datautil;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JsonReader {
    public static <T> T readJson(String filePath, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        T data = null;
        try {
            data = objectMapper.readValue(new File(filePath), clazz);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
        return data;
    }

}
