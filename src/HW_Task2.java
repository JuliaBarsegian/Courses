import java.util.Scanner;

public class HW_Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число до 100");
        Scanner in = new Scanner(System.in);
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] % 2 == 0) {
                System.out.println("Вы ввели четное число " + nums[i]);
            } else {
                System.out.println("Вы ввели нечетное число " + nums[i]);
            }
            break;
        }
    }
}