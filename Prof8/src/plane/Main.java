package plane;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("plane.txt");
        Plane plane = new Plane(5, "Airbus",
                new Engine(2000, 5000),
                new Wings(20),
                new Chassis(5));

        System.out.println(plane);
        output(plane,f);
        input(f);
    }

    public static void output(Plane plane, File f){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){
            oos.writeObject(plane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void input (File f){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            Plane plane = (Plane) ois.readObject();
            System.out.println("New plane: " + plane);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
