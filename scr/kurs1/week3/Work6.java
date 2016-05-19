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
        String num = "00011100";
        char[] mas = num.toCharArray();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int zeroCount = countZeroSeq(mas, 3);
        System.out.println(zeroCount);
    }

    public static int countZeroSeq(char[] mas, int startPos) {
        int count = 0;
        for (int i = startPos; i < mas.length; i++) {
            if (mas[startPos] == '0' && mas[startPos++] == '0')
                count++;
        }
        return count;
    }
}




