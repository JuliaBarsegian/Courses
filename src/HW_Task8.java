public class HW_Task8 {
    public static void main(String[] arg) {
        System.out.println("Числа от 0 до 100, которые делятся на 3 без остатка:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}
