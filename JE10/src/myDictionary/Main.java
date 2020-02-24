package myDictionary;

public class Main {
    public static void main(String[] args) {

        MyDictionary<String, String> dictionary = new MyDictionary<>();

        dictionary.addValue("a", "b");
        dictionary.addValue("a1", "b1");
        dictionary.addValue("a2", "b2");

        System.out.println(dictionary.get());
        System.out.println(dictionary.indexOf("a1"));
        System.out.println("dictionary size = " + dictionary.sizeOf());
    }
}
