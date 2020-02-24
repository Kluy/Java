package Computer;

public class Computer {

    String name;

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            computers[i].name = "name" + i;
            System.out.println(computers[i].name);
        }
    }
}