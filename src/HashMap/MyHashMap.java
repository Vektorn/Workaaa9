package HashMap;
public class MyHashMap <K, V> {
    public class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;
        public Entry(K key, V value, Entry<K, V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
        public K getKey() {
            return key;
        }
        public void setKey(K key) {
            this.key = key;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V value) {
            this.value = value;
        }
        public Entry getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }
    }








}
//        private K key;
//        private V value;
//        private MyHashMap<K, V> next;
//        public MyHashMap(K key, V value){
//            this.key = key;
//            this.value = value;
//
//        }
//    public K getKey() {
//            return key;
//        }
//        public void setKey(K key) {
//            this.key = key;
//        }
//        public V getValue() {
//            return value;
//        }
//        public void setValue(V value) {
//            this.value = value;
//        }
//        public MyHashMap getNext() {
//            return next;
//        }
//        public void setNext(MyHashMap<K, V> next) {
//            this.next = next;
//        }
//        private int capacity = 16;
//        private MyHashMap<K, V>[] table;
//        public void CustomHashMap(){
//            table = new MyHashMap[capacity];
//        }
//        public void CustomHashMap(int capacity){
//            this.capacity = capacity;
//            table = new MyHashMap[capacity];
//        }
//        public void put(K key, V value){
//            int index = index(key);
//            MyHashMap newEntry = new MyHashMap(key, value);
//            if(table[index] == null){
//                table[index] = newEntry;
//            }else {
//                MyHashMap<K, V> previousNode = null;
//                MyHashMap<K, V> currentNode = table[index];
//                while(currentNode != null){
//                    if(currentNode.getKey().equals(key)){
//                        currentNode.setValue(value);
//                        break;
//                    }
//                    previousNode = currentNode;
//                    currentNode = currentNode.getNext();
//                }
//                if(previousNode != null)
//                    previousNode.setNext(newEntry);
//            }
//        }
//        public V get(K key){
//            V value = null;
//            int index = index(key);
//            MyHashMap<K, V> entry = table[index];
//            while (entry != null){
//                if(entry.getKey().equals(key)) {
//                    value = entry.getValue();
//                    break;
//                }
//                entry = entry.getNext();
//            }
//            return value;
//        }
//        public void remove(K key){
//            int index = index(key);
//            MyHashMap previous = null;
//            MyHashMap entry = table[index];
//            while (entry != null){
//                if(entry.getKey().equals(key)){
//                    if(previous == null){
//                        entry = entry.getNext();
//                        table[index] = entry;
//                        return;
//                    }else {
//                        previous.setNext(entry.getNext());
//                        return;
//                    }
//                }
//                previous = entry;
//                entry = entry.getNext();
//            }
//        }
//        public void display(){
//            for(int i = 0; i < capacity; i++){
//                if(table[i] != null){
//                    MyHashMap<K, V> currentNode = table[i];
//                    while (currentNode != null){
//                        System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
//                        currentNode = currentNode.getNext();
//                    }
//                }
//            }
//        }
//
//        private int index(K key){
//            if(key == null){
//                return 0;
//            }
//            return Math.abs(key.hashCode() % capacity);
//        }
//    }
//
