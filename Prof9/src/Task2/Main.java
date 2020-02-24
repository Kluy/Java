package Task2;

public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread min = new Thread(new OtherThread());
        Thread norm = new Thread(new OtherThread());
        Thread max = new Thread(new OtherThread());
        min.setName("min");
        max.setName("max");
        norm.setName("norm");
        min.setPriority(10);
        max.setPriority(1);
        norm.start();
        max.start();
        min.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class OtherThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
