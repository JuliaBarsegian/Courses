package HW_18_10_19;

public class HW_Task6 {
    public static void main(String[] args) {
        int number = 7;
        int i = number;
        while (i > 1) {
            i--;
            number = number * i;
        }
        System.out.print(number);
    }
}