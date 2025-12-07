package ignaUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonUtils {

    public static <T> T readJson(String path, Class<T> clazz) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(path), clazz);
        } catch (Exception e) {
            throw new RuntimeException("Eroare la citirea JSON: " + path, e);
        }
    }
}
