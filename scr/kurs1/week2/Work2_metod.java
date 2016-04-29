package scr.kurs1.week2;

/**
 * Created by miha on 29.04.2016.
 */
public class Work2_metod {

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 8, 4};

        System.out.print("Входящий массив:  ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");}
        System.out.println(" ");



          int min = minMassiv(mas);
          int max = maxMassiv(mas);
//
//        System.out.println("Минимум " + min);
//        System.out.println("Максимум " + max);
        System.out.print("исходящий массив:  ");


        if (min != max){

            for (int i = 0; i < mas.length; i++)
                if (mas[i] == max)
                    mas[i] = min;
                else if (mas[i] == min)
                    mas[i] = max;
        }


        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }

        System.out.println();

    }
/***************************************************************************************************************/

    public static int minMassiv ( int [] mas) {
       int min = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (min > mas[i]) {
                min = mas[i];
            }
        }
        return min;
    }

    public static int maxMassiv ( int [] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (max < mas[i])
                max = mas[i];
        }
        return max;
    }

}
