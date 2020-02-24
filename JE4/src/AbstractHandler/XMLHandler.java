package AbstractHandler;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open xml");
    }

    @Override
    void create() {
        System.out.println("Create xml");
    }

    @Override
    void change() {
        System.out.println("Change xml");
    }

    @Override
    void save() {
        System.out.println("Save xml");
    }
}
