// Ввести дату из консоли и проверить, что она соответствует формату YYYY/MM/DD HH:MM:SS
package HW_22_11_19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {

    private final static Pattern DATE_PATTERN = Pattern.compile("\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}");

    public static void main(String[] args) {
        String str;
        Scanner sс = new Scanner(System.in);
        System.out.println("Введите дату в формате YYYY/MM/DD HH:MM:SS");
        str = sс.nextLine();
        if (isValid(str)) {
            System.out.println("Дата соответствует формату YYYY/MM/DD HH:MM:SS");
        } else {
            System.out.println("Дата не соответствует формату YYYY/MM/DD HH:MM:SS");
        }
    }

    private static boolean isValid(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
}