package HW_18_10_19;

import java.util.Scanner;

public class HW_Task1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите число до 10:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        if (number == 7) {
            System.out.println("Поздравляю! Вы ввели число " + number);
        } else {
            System.out.println("Введенное Вами число не равно 7");
        }
    }
}
