package HW_18_10_19;

import java.util.Scanner;

public class HW_Task3 {
    public static void main(String[] arg) {
        System.out.println("Введите сторону a");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите сторону b");
        int b = in.nextInt();
        System.out.println("Введите радиус r");
        int r = in.nextInt();
        if (2 * r >= Math.sqrt(a * a + b * b)) {
            System.out.println("Прямоугольное отверстие можно закрыть круглой картонкой");
        } else {
            System.out.println("Прямоугольное отверстие нельзя закрыть круглой картонкой");
        }
    }
}