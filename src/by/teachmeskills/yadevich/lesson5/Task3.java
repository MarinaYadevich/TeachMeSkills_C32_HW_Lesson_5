package by.teachmeskills.yadevich.lesson5;

import java.util.Arrays;

/** 3. Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму всех элементов массива.
 */


public class Task3 {
    public static void main(String[] args) {
        //                 0   1  2
        int[][] arrays = { {3, 4, 8}, // 0
                          {4, 78, 1}, // 1
                          {56, 7, 90} // 2
        };

        System.out.println("Source array: " + Arrays.deepToString(arrays));

        int sum = 0;
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                sum += arrays[i][j];
            }
        }
        System.out.println("Sum of all elements of ann array: " + sum);
    }
}
