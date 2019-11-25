// Считать из файла строку и вывести ее на консоль так, чтобы слова в этой строке шли в обратном порядке.
// Hello this is Java!
//Результат:
//Java! Is this Hello
package HW_22_11_19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\tmp\\task4.txt"))) {
            String str;
            str = bufferedReader.readLine();
            System.out.println(str);
            String[] array = str.split(" ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}