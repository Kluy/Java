import java.util.Objects;

public class Laptop {
    private int id;
    private String model;
    private String companyName;
    private int price;
    private int quantity;
    private String cpu;
    private String memory;
    private String ram;
    private String resolution;
    private String batteryLife;

    public Laptop(){}

    public Laptop(int id, String model, String companyName,
                  int price, int quantity, String cpu,
                  String memory, String ram, String resolution, String batteryLife) {
        this.id = id;
        this.model = model;
        this.companyName = companyName;
        this.price = price;
        this.quantity = quantity;
        this.cpu = cpu;
        this.memory = memory;
        this.ram = ram;
        this.resolution = resolution;
        this.batteryLife = batteryLife;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id &&
                price == laptop.price &&
                quantity == laptop.quantity &&
                Objects.equals(model, laptop.model) &&
                Objects.equals(companyName, laptop.companyName) &&
                Objects.equals(cpu, laptop.cpu) &&
                Objects.equals(memory, laptop.memory) &&
                Objects.equals(ram, laptop.ram) &&
                Objects.equals(resolution, laptop.resolution) &&
                Objects.equals(batteryLife, laptop.batteryLife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, companyName, price, quantity, cpu, memory, ram, resolution, batteryLife);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", Model='" + model + '\'' +
                ", Company='" + companyName + '\'' +
                ", Price=" + price +
                ", Quantity=" + quantity +
                ", CPU='" + cpu + '\'' +
                ", Memory='" + memory + '\'' +
                ", RAM='" + ram + '\'' +
                ", Screen resolution='" + resolution + '\'' +
                ", Battery life='" + batteryLife + '\'' +
                '}';
    }
}
