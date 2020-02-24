package myDictionary;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey, TValue> {

    private Map<TKey, TValue> dictionary = new HashMap<>();

    public Map<TKey, TValue> get() {
        return dictionary;
    }

    public void addValue(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    public TValue indexOf(TKey key) {
        return dictionary.get(key);

    }

    public int sizeOf() {
        return dictionary.size();
    }
}
