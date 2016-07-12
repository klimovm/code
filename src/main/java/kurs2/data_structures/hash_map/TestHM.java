package kurs2.data_structures.hash_map;

/**
 * Created by miha on 12.07.2016.
 */
public class TestHM {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>(3);
        map.put(6, "A");
        map.put(12, "B");
        map.put(18, "C");
        map.put(24, "D");
        map.put(18, "F");
    }
}
