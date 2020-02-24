package starSystem;

public class Star{
    private String name;
    private String type;

    public Star(){}

    public Star(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
