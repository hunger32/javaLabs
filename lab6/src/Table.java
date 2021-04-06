import java.util.ArrayList;
import java.util.Objects;

public class Table<K,V> {
    private ArrayList<Entry<K,V>> table;

    Table ()
    {
        table = new ArrayList<>();
    }

    public V get(K key)
    {
        var val = table.stream().filter(a -> a.key.equals(key)).findFirst().get().value;
        return val;
    }

    public void put(K key, V value)
    {
        var entry = table.stream().filter(a -> a.key.equals(key)).findFirst();
        if (!entry.isEmpty()) {
            entry.get().value = value;
            return;
        }

        table.add(new Entry<>(key, value));
    }

    public boolean remove(K key)
    {
        return table.removeIf(a -> a.key.equals(key));
    }

    class Entry<K,V> {
        public K key;
        public V value;

        Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry<?, ?> entry = (Entry<?, ?>) o;
            return key.equals(entry.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }
}
