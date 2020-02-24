package zooclub;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ZooClub {
    private String name;
    Map<Person, List<Animal>> map;

    public ZooClub(){}

    public ZooClub(Map<Person, List<Animal>> map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZooClub)) return false;
        ZooClub zooClub = (ZooClub) o;
        return Objects.equals(map, zooClub.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "map=" + map +
                '}';
    }
}
