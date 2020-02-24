package Teach;

public class Main {
    public static void main(String[] args) {
        Employer engineer = new Engineer();
        Employer chef = new Chef();

        Chef chef1 = new Chef();
        Engineer engineer1 = new Engineer();

        engineer1.talk();
        chef1.talk();

        engineer.talk();
        chef.talk();

    }
}