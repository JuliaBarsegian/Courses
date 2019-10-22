package HW_18_10_19;

import java.util.Scanner;

public class HW_Task2 {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите число до 100");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Вы ввели четное число " + number);
        } else {
            System.out.println("Вы ввели нечетное число " + number);
        }
    }
}