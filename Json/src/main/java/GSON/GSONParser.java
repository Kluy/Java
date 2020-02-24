package GSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class GSONParser {
    public static void parseJson(String path) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new FileReader(path));
        jsonReader.setLenient(true);

        User user = gson.fromJson(jsonReader, User.class);

        System.out.println(user);
    }
}
