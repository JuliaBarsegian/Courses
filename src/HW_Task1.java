import java.util.Scanner;

public class HW_Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число до 10:");
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] == 7) {
                System.out.println("Поздравляю! Вы ввели число " + nums[i]);
                break;
            } else {
                System.out.println("Введенное Вами число не равно 7");
                break;
            }
        }
    }
}