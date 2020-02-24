package model;

import org.springframework.stereotype.Component;

@Component
public class FoodImpl implements Food {
    @Override
    public String toString() {
        return "FoodImpl";
    }
}
