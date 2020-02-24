package car;

import java.util.Comparator;

public class SortByPrice implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
