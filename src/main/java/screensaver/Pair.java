package screensaver;

import java.util.Map;

public class Pair<K, V> implements Map.Entry {

    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Object setValue(Object o) {
        return value = (V)o;
    }
}
