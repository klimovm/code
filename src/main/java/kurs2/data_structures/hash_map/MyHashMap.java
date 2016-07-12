package kurs2.data_structures.hash_map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by miha on 12.07.2016.
 */
public class MyHashMap<K ,V> {
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private static final int DEFAULT_CAPACITY = 16;
    private MyEntry<K, V>[] table;
    private double loadFactor;
    private int threshold;
    private int capacity;
    private int size;

    @SuppressWarnings({"rawtypes","unchecked"})
    public MyHashMap() {
        loadFactor = DEFAULT_LOAD_FACTOR;
        capacity = DEFAULT_CAPACITY;
        table = (MyEntry<K, V>[])new MyEntry[capacity];
        threshold = (int)(capacity * loadFactor);
    }
    @SuppressWarnings({"rawtypes","unchecked"})
    public MyHashMap(int capacity) {
        this.capacity = capacity;
        loadFactor = DEFAULT_LOAD_FACTOR;

        table = (MyEntry<K, V>[]) new MyEntry[capacity];
        threshold = (int)(capacity * loadFactor);

    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public MyHashMap(double loadFactor, int capacity) {
        this.loadFactor = loadFactor;
        this.capacity = capacity;
        table = (MyEntry<K, V>[])new MyEntry[capacity];
        threshold = (int)(capacity * loadFactor);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {

//        check k != null
//        findIdx
//        check for equal
//            if true -> rewrite
//            else -> put
//                    checkThreshold
//                          if place enough -> put
//                          else resize() -> transfer -> put


        if(key == null){
//        todo put for null
            return value;
        }
        int position = findPosition(key);


        if(table[position] == null){
           /* if(size >= threshold){
                resize();
            }*/
            table[position] = new MyEntry<>(key, value);

        } else {
            MyEntry<K, V> iterator = table[position];
            MyEntry<K,V> parent;
            do {
                parent = iterator;
                if(key.equals(iterator.key)) {
                    V forReturn = iterator.getValue();
                    iterator.setValue(value);
                    return forReturn;
                }
                iterator = iterator.next;
            }  while (iterator != null);
            parent.next = new MyEntry<>(key, value);
        }
        size++;
        if(size >= threshold){
            resize();
        }
        return null;
    }

    private boolean resize() {
        @SuppressWarnings({"rawtypes", "unchecked"})
        MyEntry<K, V>[] resized = (MyEntry<K, V>[])new MyEntry[table.length * 2];
        threshold = (int)(resized.length * loadFactor);

        return rehash(resized);
    }

    private boolean rehash(MyEntry<K, V>[] resized) {

        for (int i = 0; i < table.length; i++) {
            if(table[i] == null) continue;
            MyEntry<K, V> iterator = table[i];
            while (iterator != null){
                putInNewTable(resized, iterator);
                iterator = iterator.next;
            }
        }
        table = resized;
        return true;
    }

    private void putInNewTable(MyEntry<K, V>[] resized, MyEntry<K, V> current) {
        MyEntry<K, V> copy = new MyEntry<>(current.getKey(), current.getValue());
        int position = findPosition(current.key);
        if(current.key == null){
//        todo put for null
            return;
        }
        if(resized[position] == null){
            resized[position] = copy;

        } else {
            MyEntry<K, V> iterator = resized[position];
            MyEntry<K,V> parent;
            do {
                parent = iterator;
                iterator = iterator.next;
            }  while (iterator != null);
            parent.next = copy;
        }
    }

    private int findPosition(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public V remove(Object key) {
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {

    }

    public void clear() {

    }

    public Set<K> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }

    public Set<MyEntry<K, V>> entrySet() {
        return null;
    }

    public static class MyEntry<K, V>{

        public K key;
        public V value;
        public MyEntry<K, V> next;

        public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        //        @Override
        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            V forReturn = this.value;
            this.value = value;
            return forReturn;
        }
    }
}
