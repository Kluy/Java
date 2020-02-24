package animal;

public enum Animal {
    DOG(2), CAT(3), TIGER(8), LION(12), ELEFANT(20), COW(6);

    private int age;

    Animal(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + " " +
                " age: " + age;
    }
}