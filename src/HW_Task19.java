public class HW_Task19 {
    public static boolean recursion(int n, int i) {
        if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int num = 18;
        if (recursion(num, 2)) {
            System.out.printf("Is number %d simple - YES", num);
        } else {
            System.out.printf("Is number %d simple - NO", num);
        }
    }
}