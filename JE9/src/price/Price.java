package price;

public class Price implements Comparable<Price>{
    private String name;
    private String storeName;
    private int price;

    public Price(String name, String storeName, int price) {
        this.name = name;
        this.storeName = storeName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public int compareTo(Price o) {
        int tmp = this.price - o.price;

        if (tmp == 0) {
            return this.name.compareTo(o.name);
        } else {
            return tmp;
        }
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", storeName='" + storeName + '\'' +
                ", price=" + price +
                '}';
    }
}
