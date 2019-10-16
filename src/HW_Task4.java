import java.util.Scanner;

public class HW_Task4 {
    public static void main(String[] arg) {
        System.out.println("Введите число до 10");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Восресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
                break;
        }
    }
}