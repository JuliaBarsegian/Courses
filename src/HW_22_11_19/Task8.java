// Проверить доменные имена для протоколов http и https на правильность. http://example.com/ - верный формат адреса. example.com – неверный.
package HW_22_11_19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task8 {

    private static final Pattern HTTPS_PATTERN = Pattern.compile("https?://\\S{2,2083}");

    public static void main(String[] args) {
        String url;
        Scanner sс = new Scanner(System.in);
        System.out.println("Введите урл, пример: http://example.com ");
        url = sс.nextLine();
        if (isValid(url)) {
            System.out.println("Адрес имеет верный формат");
        } else {
            System.out.println("Адрес имеет неверный формат");
        }
    }

    private static boolean isValid(String url) {
        return HTTPS_PATTERN.matcher(url).matches();
    }
}