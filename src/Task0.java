
import java.util.Arrays;
import java.util.Scanner;

/** 0. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */

public class Task0 {
    public static void main(String[] args) {
        //                          i  j  b
        int[][][] arrays = new int [2][3][2];
        System.out.println("Source array" + Arrays.deepToString(arrays));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        sc.close();



        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                for(int b = 0; b < arrays[i][j].length; b++){
                    arrays[i][j][b] += a;
                }
            }
        }
        System.out.println(Arrays.deepToString(arrays));
    }
}
