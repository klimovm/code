package scr.kurs1.week3;

import scr.kurs1.week2.ArrayUtils;

import java.util.Arrays;
import java.util.zip.Inflater;

/**
 * Created by miha on 16.05.2016.
 */
/* Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
		Вход:
		10001101001
		Выход:
    	(2,4) - цепочка нулей
		(5,6) - цепочка единиц
*/
public class Work6 {
    public static void main(String[] args) {
        //012345678
        String num = "10001010011";
        String [] mas = num.split("");
        for (int i = 0; i <mas.length ; i++) {
            System.out.print(mas[i]+" ");
        }
        int indexStart0 = 0;
        for (int i = 0; i <mas.length-1 ; i++) {
            if (mas[i] == "0" && mas[i] == mas[i+1]){
                indexStart0 += indexStart0;
            }
        }
        System.out.println();
        System.out.println(indexStart0);
        System.out.println(mas.length);
        System.out.println(num.length());
    }
}



