package Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JacksonParser {

    public static void parseJson(String path){
        ObjectMapper objectMapper = new ObjectMapper();
        User user = null;

        try {
            user = objectMapper.readValue(new File(path), User.class);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(user);

    }
}
