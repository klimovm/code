package scr.kurs1.week2;

/**
 * Created by miha on 29.04.2016.
 */
public class Work2_metod {

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5};

        System.out.print("Входящий массив:  ");
        ArrayUtils.printArr(mas);
        System.out.println(" ");

        int min = ArrayUtils.minMassiv(mas);
        int max = ArrayUtils.maxMassiv(mas);

        int indexmax = ArrayUtils.indexMax(max, mas);
        int indexmin = ArrayUtils.indexMin(min, mas);

        mas[indexmax] = min;
        mas[indexmin] = max;

        System.out.println("Минимум " + min);
        System.out.println("Максимум " + max);
        System.out.print("исходящий массив:  ");

        ArrayUtils.printArr(mas);
        System.out.println();

    }
}





