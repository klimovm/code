package kurs1.week2;

/**
 * Created by miha on 29.04.2016.
 */
public class Work2Instrument {

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5};

        System.out.print("Входящий массив:  ");
        ArrayUtils.printArr(mas);
        System.out.println(" ");

        int min = ArrayUtils.findMin(mas);
        int max = ArrayUtils.findMAx(mas);

        int indexmax = ArrayUtils.findIndexMax(max, mas);
        int indexmin = ArrayUtils.findIndexMin(min, mas);

        mas[indexmax] = min;
        mas[indexmin] = max;

        System.out.println("Минимум " + min);
        System.out.println("Максимум " + max);
        System.out.print("исходящий массив:  ");

        ArrayUtils.printArr(mas);

    }
}





