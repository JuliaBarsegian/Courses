package HW_18_10_19;

import java.util.Scanner;

public class HW_Task19 {
    public static boolean recursion(int n, int i) {
        if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n - 1) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        while (true){
            System.out.println("Введите число больше 1:");
            num = in.nextInt();
            if(num>1)
                break;
        }
        if (recursion(num, 2)) {
            System.out.printf("Is number %d simple - YES", num);
        } else {
            System.out.printf("Is number %d simple - NO", num);
        }
    }
}