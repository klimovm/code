package myTrening;



import java.util.Arrays;

/**
 * Created by miha on 23.05.2016.
 */
public class SortStringArray {
    public static void main(String[] args) {
        String [] auto = {"BMW","Opel","Audi"};
        sortAuto(auto);

    }
    public static void sortAuto (String [] mas) {
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
        }
    }
}
