package testData;

import java.io.File;

import commons.GlobalConstants;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import io.qameta.allure.internal.shadowed.jackson.databind.DeserializationFeature;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

public class JsonReader {
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;

    public static JsonReader getUserInfo(String fileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
            return mapper.readValue(new File(GlobalConstants.RESOURCE_PATH + fileName), JsonReader.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
