package HashMap;
public class MyHashMap<K, V> {
    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;
        public Entry(K key, V value) {
            this.key=key;
            this.value= value;
        }
        public K getKey() {
            return this.key;
        }
        public V getValue() {
            return this.value;
        }
        public void setValue(V value) {
            this.value = value;
        }
        @Override
        public String toString() {
            Entry<K, V> temp = this;
            StringBuilder sd = new StringBuilder();
            while (temp != null) {
                sd.append(temp.key + " -> " + temp.value + ",");
                temp = temp.next;
            }
            return sd.toString();
        }
    }
    private final int SIZE = 5;
    private Entry<K, V> table[];
    private int count = 0;
    public MyHashMap() {
        table= new Entry[SIZE];
    }
    public void put(K key,V value) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];
        if (e==null) {
            table[hash] = new Entry<>(key, value);
        }else {
            while (e.next != null) {
                if (e.getKey()==key) {
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }
            if (e.getKey() == key) {
                e.setValue(value);
                return;
            }
            e.next = new Entry<K, V>(key, value);
        }
        count++;
    }
    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];
        if (e == null) {
            return null;
        }
        while(e != null) {
            if(e.getKey()==key) {
                return e.getValue();
            }
            e = e.next;
        }
        return null;
    }
    public  Entry<K, V> remove(K key) {
        count--;
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];
        if (e == null) {
            return null;
        }
        if (e.getKey() == key) {
            table[hash]=e.next;
            e.next= null;
            return e;
        }
        Entry<K, V> prev = e;
        e=e.next;
        while(e !=null) {
            if(e.getKey()==key) {
                prev.next = e.next;
                e.next = null;
                return e;
            }
            prev = e;
            e=e.next;
        }
        return null;
    }
    public int size() {
        return count;
    }
    public void clear() {
        table= new Entry[SIZE];
        count=0;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<SIZE;i++) {
            if (table[i] != null) {
                sb.append(i + " " + table[i]+ "\n");
            } else {
                sb.append(i + " " +"null"+ "\n");
            }
        }
        return sb.toString();
    }
}