// Найти максимальный байт в файле и вывести его на экран.
// Имя файла необходимо ввести с консоли. Закрыть поток ввода-вывода после выполнения
package HW_22_11_19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите имя файла:");  // D:\tmp\task1_2.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int max = file.read();
        while (file.available() > 0) {
            int data = file.read();
            if (data > max) {
                max = data;
            }
        }
        System.out.println("Максимальный байт в файле: " + max);
        file.close();
        reader.close();
    }
}