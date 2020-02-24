package AbstractHandler;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open txt");
    }

    @Override
    void create() {
        System.out.println("Create txt");
    }

    @Override
    void change() {
        System.out.println("Change txt");
    }

    @Override
    void save() {
        System.out.println("Save txt");
    }
}
