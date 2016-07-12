package kurs2.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by miha on 12.07.2016.
 */
public class HashMapIntro {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
//        entrySet.iterator()

        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.printf("Key - %d value - %s\n", entry.getKey(), entry.getValue());
        }


        String result = map.put(2, "B");

        System.out.println(result);
        System.out.println(map.get(2));

    }

}
