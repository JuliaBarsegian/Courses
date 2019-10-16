import java.util.Scanner;

public class HW_Task5 {
    public static void main(String[] arg) {
        System.out.println("Введите число до 10");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Все четные числа от 0 до введенного Вами числа:");
        for (int i = 1; i <= num; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }
}