package vehicles;

class Main {
    public static void main(String[] args) {

        Vehicles vehicles = null;

        System.out.println(vehicles.Lexus);
        System.out.println(vehicles.BMW);
        System.out.println(vehicles.Maybach);
    }
}

public enum Vehicles {

        Lexus(10000, "red"), BMW(20000, "white"), Maybach(30000, "black");

        private int price;
        private String color;

        Vehicles(int price, String color) {
            this.price = price;
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return this.name() + " " + price + "$" + ", color: " + this.getColor();
        }
    }