// Составить регулярное выражение,определяющее, является ли заданная строка IP адресом, записанным в десятичном виде.
package HW_22_11_19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {
    private final static Pattern IP_ADDRESS_PATTERN = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    public static void main(String[] args) {
        String ip;
        Scanner sс = new Scanner(System.in);
        System.out.println("Введите IP адрес:");
        ip = sс.nextLine();
        if (isValid(ip)) {
            System.out.println("Строка является IP адресом");
        } else {
            System.out.println("Строка не является IP адресом");
        }
    }

    public static boolean isValid(String ip) {
        return IP_ADDRESS_PATTERN.matcher(ip).matches();
    }
}