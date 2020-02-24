package comparable;

    public class Animal implements Comparable<Animal> {
        private String breed;
        private int weight;
        private int speed;
        private int price;

        Animal(String breed, int weight, int speed, int price) {
            this.breed = breed;
            this.weight = weight;
            this.speed = speed;
            this.price = price;
        }

        public String toString() {
            return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
        }

        public int compareTo(Animal o) {
            int tmp = this.speed - o.speed;

            if (tmp == 0) {
                if (this.price - o.price == 0) {
                    if (this.breed.equals(o.breed)) {
                        return this.weight - o.weight;
                    }
                    return this.breed.compareTo(o.breed);
                }
                return this.price - o.price;
            } else return tmp;
        }
    }