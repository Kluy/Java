import java.util.ArrayList;
import java.util.List;

class MyList<T> {
    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void add(T t) {
        list.add(t);
    }

    public int index(T t) {
        return list.indexOf(t);

    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.getList());
        System.out.println(list.index("a"));
        System.out.println(list.size());
    }
}
