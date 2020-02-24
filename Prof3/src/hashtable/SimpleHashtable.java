package hashtable;

import java.util.*;

public class SimpleHashtable<T1,T2>{

    private List<Bucket<T1,T2>> list;

    public SimpleHashtable() {
        list = new ArrayList<>();
    }

    public void put (T1 a, T2 b){
        list.add(new Bucket<>(a,b));
    }

    public void removeItem (T1 a, T2 b){
        list.remove(new Bucket<>(a,b));
    }

    public void getItem (int id){
        System.out.println(list.get(id));
    }

    @Override
    public String toString() {
        return "SimpleHashtable{" +
                "list=" + list +
                '}';
    }
}
