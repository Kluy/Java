package AbstractHandler;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open doc");
    }

    @Override
    void create() {
        System.out.println("Create doc");
    }

    @Override
    void change() {
        System.out.println("Change doc");
    }

    @Override
    void save() {
        System.out.println("Save doc");
    }
}
