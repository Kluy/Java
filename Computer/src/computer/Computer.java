package computer;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private SSD ssd;

    public Computer(){}

    public void info(CPU cpu, RAM ram, SSD ssd){
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }

    public class CPU {
        private int frequency;

        public CPU(){}

        public CPU(int frequency) {
            this.frequency = frequency;
        }

        @Override
        public String toString() {
            return "CPU{" +
                    "frequency=" + frequency +
                    '}';
        }
    }

    public class RAM {
        private int size;

        public RAM (){}

        public RAM(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "size=" + size +
                    '}';
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

    public class SSD extends RAM{
        public SSD() {
        }

        public SSD(int size) {
            super(size);
        }

        @Override
        public String toString() {
            return "SSD{" +
                    "size=" + getSize() +
                    '}';
        }
    }
}