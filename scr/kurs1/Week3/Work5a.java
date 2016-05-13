package scr.kurs1.week3;

import scr.kurs1.week2.ArrayUtils;

import java.util.Arrays;

/**
 * Created by miha on 10.05.2016.
 */
//а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)

public class Work5a {
    public static void main(String[] args) {
        String[][] matrix = {{"Олег", "Ян", "Витя1"},
                             {"Катя1111", "Даша11", "Настя11", "Соня1"},
                             {"Кот", "Пес2"}};
                             ///Создали двумерный массив

        System.out.println("Входящая матрица:");
        printMatrixString(matrix); //вывели входящую матрицу с помощью метода,
                                  // который преобразует двумерный масив в строки

        int rowMinIndex = 0; //создали переменную,которая показывает индекс минимальной строки матрицы
        int rowMaxIndex = 0;//создали переменную,которая показывает индекс максимальный строки матрицы

        int maxC = count(matrix[0]);//создали переменную,которая показывает длину максимальный строки матрицы
        int minC = count(matrix[0]);//создали переменную,которая показывает длину минимальной строки матрицы

        for (int i = 0; i < matrix.length; i++) {//проходим по длине массива
            int tempCount = count(matrix[i]);//переменная,которая показывает количество символов массива

            if(tempCount < minC){//если количество символов массива < длины минимальной строки матрицы
                minC = tempCount;//то перезаписываем минимальную строку
                rowMinIndex = i;//записываем индекс минимальной строки
            }

            if(tempCount > maxC){//если количество символов массива > длины максимальной строки матрицы
                maxC = tempCount;//то перезаписываем максимальную строку
                rowMaxIndex = i;//записываем индекс максимальной строки
            }
        }

        // swapping
        String[] temp = matrix[rowMinIndex];//создали масив который равен масиву с минимальным к-вом символов
        matrix[rowMinIndex] =  matrix[rowMaxIndex];
        matrix[rowMaxIndex] = temp;//перезаписали максимальный масив с минимальным.

        System.out.println(matrix.length);//на консоль размер матрицы
        System.out.println(rowMinIndex);//на консоль index минимальной строки
        System.out.println(rowMaxIndex);//на консоль index максимальной строки
        System.out.println(maxC);//на консоль к-ство символов максимальной строки
        System.out.println(minC);//на консоль к-ство символов мминимальной строки
        printMatrixString(matrix);//на консоль матрица с заменой массивов

    }


    /******************************************************************************************************************/
    public static void printMatrixString(String[][] mas) {
        /*Метод преобразовует матрицу в строку и выводит на консоль*/
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
    }

    /******************************************************************************************************************/
    public static int count(String[] masiv) {
        /*Метод считает количество символов в строке */
        int count = 0;
        for (int i = 0; i < masiv.length; i++) {
            count += masiv[i].length();//количество елементов строки с i-м индексом
        }
        return count;//возвращает значение
    }
}

