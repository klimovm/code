package scr.kurs1.week2;

/**
 * Created by miha on 29.04.2016.
 */
public class Work2_odinMetod {
    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5};
        Metod.vozvratMasiv(mas);

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }
}
