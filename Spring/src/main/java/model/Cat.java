package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;
    private int age;
    private Food food;

    public Cat(){}

    public Cat(String name, int age, Food food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Food getFood() {
        return food;
    }

    @Autowired
    public void setFood(Food food) {
        this.food = food;
    }
}
