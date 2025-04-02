package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {
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
