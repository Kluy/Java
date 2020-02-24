package device;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "334dd", 2000, 1500);
//        Monitor monitor2 = new Monitor(2000, 1500);
//        Monitor monitor1 = new Monitor();
//        Device device1 = new Device("Samsung", 120, "AB1234567CD");
//        monitor.setManufacturer("Samsung");
//        monitor1.setManufacturer("Samsung");
//        monitor2.setManufacturer("Samsung");
//        monitor.setPrice(120);
//        monitor1.setPrice(120);
//        monitor2.setPrice(120);
//        monitor.setSerialNumber("AB1234567CD");
//        monitor1.setSerialNumber("AB1234567CD");
//        monitor2.setSerialNumber("AB1234567CD");
        System.out.println(device.toString());
        System.out.println(monitor.toString());

        System.out.println(monitor.hashCode());
//        System.out.println(monitor1.hashCode());
//        System.out.println(monitor2.hashCode());
        System.out.println(device.hashCode());
//        System.out.println(device1.hashCode());

        System.out.println(device.equals(monitor));
//        System.out.println(monitor.equals(monitor1));
//        System.out.println(device.equals(device1));
        System.out.println(monitor.equals(device));
//        System.out.println(monitor.equals(monitor2));
//        System.out.println(device.equals(monitor1));
    }
}