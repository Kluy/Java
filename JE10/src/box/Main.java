package box;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Box<Integer, String>> list = new ArrayList<>();
        list.add(new Box<>(2222, "jsjsjh"));
        list.add(new Box<>(22882, "jsjsjh"));
        list.add(new Box<>(2299, "jsjsjh"));

        System.out.println(list);

        Box<Integer, String>[] boxes = new Box [3];

        boxes[0] = new Box(12.343, "aasdasdasd");
        boxes[1] = new Box(12, 3342);
        boxes[2] = new Box(12.234324, "dfssf sfsd");

        for(Box boxes12 : boxes){
            System.out.println(boxes12.toString());
        }
    }
}