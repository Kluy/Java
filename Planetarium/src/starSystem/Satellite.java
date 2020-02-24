package starSystem;

public class Satellite extends Planet {
    private String name;

    public Satellite(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "name='" + name + '\'' +
                '}';
    }
}
