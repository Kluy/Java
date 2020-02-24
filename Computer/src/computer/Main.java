package computer;

 import computer.Computer.RAM;
 import computer.Computer.CPU;
 import computer.Computer.SSD;

public class Main {
    public static void main(String[] args) {

        RAM newRAM = new Computer().new RAM(8);
        CPU newCPU = new Computer().new CPU(3500);
        SSD newSSD = new Computer().new SSD(500);

        Computer computer = new Computer();

        computer.info(newCPU, newRAM, newSSD);
        System.out.println(computer.toString());
    }
}
