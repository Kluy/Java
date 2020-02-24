package util;

import model.Cat;
import model.Food;
import model.FoodImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "model")
public class MainConfig {
//    @Bean
//    public Food food(){
//        return new FoodImpl();
//    }
//
//    @Bean
//    public Cat cat(){
//        Cat cat = new Cat();
//        cat.setFood(food());
//        return cat;
//    }
}
