package HW_25_10_19;

public class HW3_Task2 {
    public static void main(String[] args) {
        String expression = "((a+b)*(a+c))-3.";
        int a = 0;
        for (char ch : expression.toCharArray()) {
            if (ch == '(') a++;
            if (ch == ')') a--;
            if (a < 0) break;
        }
        if (a != 0) {
            System.out.println("Математическое выражение: " + expression + " составлено не верно, проверьте кол-во скобок");
        } else {
            System.out.println("Математическое выражение: " + expression + " составлено верно");
        }
    }
}
