package comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("cat", 30, 2, 5000);
        Animal dog = new Animal("dog", 30, 2, 5000);
        Animal bird = new Animal("dog", 130, 2, 5000);

        Animal[] animals = {cat, dog, bird};

        Arrays.sort(animals);

        for (Animal tmp : animals) {
            System.out.println(tmp);
        }
    }
}
