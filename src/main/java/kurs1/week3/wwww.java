package kurs1.week3;

/**
 * Created by miha on 19.05.2016.
 */
public class wwww {

    public static void main(String[] args) {
        //012345678
        String s = "10001101001";
        ArrayLineSearch0(s);
        ArrayLineSearch1(s);
    }

    public static void ArrayLineSearch0(String s) {
        String[] arr0 = s.split("1");
        String max0 = arr0[0];
        int max = 0;

        for (int i = 0; i < arr0.length; i++) {
            if (max < arr0[i].length()) {
                max = arr0[i].length();
                max0 = arr0[i];

            }


        }
        System.out.println("(" + (s.indexOf(max0) + 1) + ","+ ((s.indexOf(max0))+max) + ") - цепочка нулей");
    }


    public static void ArrayLineSearch1(String s) {
        String[] arr1 = s.split("0");
        String max1 = arr1[0];
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (max < arr1[i].length()) {
                max = arr1[i].length();
                max1 = arr1[i];
            }
        }
        System.out.println();
        System.out.println("(" + (s.indexOf(max1) + 1) + ","+ ((s.indexOf(max1))+max) + ") - цепочка единиц");
    }


}

