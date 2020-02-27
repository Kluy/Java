package util;

import store.Customer;
import store.Laptop;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("dell");
        Laptop laptop2 = new Laptop("asus");
        Laptop laptop3 = new Laptop("acer");

        Customer customer1 = new Customer("Tom");
        Customer customer2 = new Customer("Den");
        Customer customer3 = new Customer("Pol");

        EntityManager em = ManagerFactory.getEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

        customer1.addLaptop(laptop1);
        customer2.addLaptop(laptop2);
        customer3.addLaptop(laptop3);

        em.persist(customer1);
        em.persist(customer2);
        em.persist(customer3);
        em.persist(laptop1);
        em.persist(laptop2);
        em.persist(laptop3);

        et.commit();

        em.close();
        ManagerFactory.close();
    }
}
