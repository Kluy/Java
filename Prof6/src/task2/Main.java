package task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/uaa912/IdeaProjects/Prof6/src/text.txt");
        FileInputStream fis = new FileInputStream(f);
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        fis.close();

        String s = new String(arr);

        String regex = "(\\s)(это|как|так|и|в|по|над|к|до|не|на|но|за|то|с|ли|а|во|от|со|для|о|же|ну|вы|бы|что|кто|он|она|К),?(\\s)+";
        System.out.println(s);
        System.out.println(s.replaceAll(regex, " Java "));
    }
}

