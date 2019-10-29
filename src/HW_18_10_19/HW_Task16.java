package HW_18_10_19;

import java.util.Scanner;

public class HW_Task16 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int b = in.nextInt();

        int[][] arr = new int[a][b];
        System.out.println("Дефолтный массив");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Модифицированный массив\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]% 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}