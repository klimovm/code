package scr.kurs1.week3;

import java.util.Arrays;

/**
 * Created by miha on 19.05.2016.
 */
public class Work6LeftVariant {
    public static void main(String[] args) {
        //012345678
        String num = "00011100";
        //char[] mas = num.toCharArray();

        int [] mas = new int [num.length()];
        for (int i=0; i<num.length(); i++) {
            mas[i] = Integer.valueOf(num.charAt(i)).intValue();//получаем символ из строки по его номеру
            //и записываем его как элемент массива
            num += Integer.toString(mas[i]);//записываем полученные символы в другую строку
        }

        int b[] = new int[mas.length-2];
        int c[] = new int[mas.length-2];
        int ind0 = -1;
        int ind1 = -1;
        int length0 = 0;
        int length1 = 0;

        if (mas[0] == 0){
            b[0] = 1;
            ind0 = 0;
            ind1 = 0;
            length0 = 0;
            length1 = 0;
        }

        for (int i = 0; i < mas.length-2; i++) {
            if (mas[i] == 0) {
                b[i] = b[i - 1] + 1;
                if (b[i] > length0) {
                    length0 = b[i];
                    ind0 = i - b[i] + 1;
                }
            }

        }
        for (int i = 0; i < mas.length-2; i++) {
            if (mas[i] == 1) {
                c[i] = c[i - 1] + 1;
                if (b[i] > length1) {
                    length1 = b[i];
                    ind0 = i - b[i] + 1;
                }
            }

        }
        System.out.println(ind0+","+(ind0+length0)+" - цепочка нулей");
        System.out.println(ind1+","+(ind1+length1)+" - цепочка единиц");


    }
}
