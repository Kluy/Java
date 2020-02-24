package car;

import java.util.Comparator;

public class SortByWeight implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}
