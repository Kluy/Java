package hashtable;

public class Main {
    public static void main(String[] args) {
        SimpleHashtable<Integer, String> table = new SimpleHashtable<>();

        table.put(1, "a");
        table.put(2, "b");
        table.put(3, "c");
        table.put(4, "d");

        System.out.println(table);

        table.removeItem(1,"a");

        System.out.println(table);

        table.getItem(2);
    }
}
