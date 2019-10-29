package HW_18_10_19;

import java.util.Scanner;

public class HW_Task13 {
    public static void main(String[] arg) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива - четное число:");
        int n = in.nextInt();
        if ((n % 2) == 0)
            System.out.println("Сгенерированный массив чисел:");
        else {
            System.out.println("Вы ввели нечетное число " + n + "\nВведите число еще раз");
        }
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int[] ms1 = new int[n];
        int[] ms2 = new int[n];

        for (int i = 0; i < mas.length / 2; i++) {
            ms1[i] = mas[i];
            ms2[i] = mas[i + mas.length / 2];
        }
        System.out.println("Первый массив");
        for (int i = 0; i < mas.length / 2; i++) {
            System.out.print(ms1[i] + " ");
        }
        System.out.println("\nВторой массив");
        for (int i = 0; i < mas.length / 2; i++) {
            System.out.print(ms2[i] + " ");
        }
        System.out.println("\nСумма элементов 2х массивов");
        for (int i = 0; i < mas.length / 2; i++) {
            System.out.print(ms1[i] + ms2[i] + " ");
        }
    }
}
