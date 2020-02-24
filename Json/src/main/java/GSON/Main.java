package GSON;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GSONParser.parseJson("src/main/resources/user.json");
    }
}
