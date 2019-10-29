package HW_18_10_19;

import java.util.Arrays;
import java.util.Scanner;

public class HW_Task12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(n / 2 - i);
        }
        System.out.println("Массив, заполненный числами по возрастанию начиная с центра массива\n" + Arrays.toString(array));
    }
}