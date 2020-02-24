package entities;

import java.util.Objects;

public class Ram {
    private int id;
    private String size;

    public Ram (){}

    public Ram(int id, String size) {
        this.id = id;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ram ram = (Ram) o;
        return id == ram.id &&
                Objects.equals(size, ram.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size);
    }

    @Override
    public String toString() {
        return "Ram{" +
                "id=" + id +
                ", size='" + size + '\'' +
                '}';
    }
}
