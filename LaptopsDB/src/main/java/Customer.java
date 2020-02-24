import javax.persistence.*;

@Entity(name = "UniCustomer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @OneToOne
    @MapsId
    private Laptop laptop;

    public Customer(){}

    public Customer(String name) {
        this.name = name;
    }

    public void addLaptop(Laptop laptop){
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", laptop='" + laptop + '\'' +
                '}';
    }
}
