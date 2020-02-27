import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tom");
        Customer customer2 = new Customer("Dan");
        Customer customer3 = new Customer("Pol");
        Customer customer4 = new Customer("Nina");
        Customer customer5 = new Customer("Jack");
        Customer customer6 = new Customer("Bruce");

        Laptop laptop1 = new Laptop("Dell");
        Laptop laptop2 = new Laptop("Asus");
        Laptop laptop3 = new Laptop("Acer");
        Laptop laptop4 = new Laptop("HP");
        Laptop laptop5 = new Laptop("Apple");

        customer1.addLaptop(laptop1);
        customer2.addLaptop(laptop2);
        customer3.addLaptop(laptop3);
        customer4.addLaptop(laptop4);
        customer5.addLaptop(laptop5);

        EntityManager entityManager = ManagerFactory.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        entityManager.persist(customer1);
        entityManager.persist(customer2);
        entityManager.persist(customer3);
        entityManager.persist(customer4);
        entityManager.persist(customer5);

        entityManager.persist(laptop1);
        entityManager.persist(laptop2);
        entityManager.persist(laptop3);
        entityManager.persist(laptop4);
        entityManager.persist(laptop5);

        entityTransaction.commit();

        for (int i = 1; i < 6; i++) {
            System.out.println(entityManager.find(Customer.class, i));
        }

        for (int i = 1; i < 6; i++) {
            System.out.println(entityManager.find(Laptop.class, i));
        }

        entityManager.close();
    }
}
