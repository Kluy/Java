package Address;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(4213);
        address.setCountry("Ukraine");
        address.setCity("Kiev");
        address.setStreet("Street");
        address.setHouse("52/13");
        address.setApartment(102);

        System.out.println("Index: "+ address.getIndex());
        System.out.println("Country: "+ address.getCountry());
        System.out.println("City: " + address.getCity());
        System.out.println("Street: " + address.getStreet());
        System.out.println("House: " + address.getHouse());
        System.out.println("Apartment: " + address.getApartment());
    }
}