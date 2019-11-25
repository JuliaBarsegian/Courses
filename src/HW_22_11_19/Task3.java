// Записать в файл перевернутую строку. Строку ввести из консоли.
package HW_22_11_19;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка после реверса: " + reverse);
        try {
            FileWriter myFile = new FileWriter("D://tmp//task3.txt");
            myFile.write(reverse);
            myFile.flush();
            System.out.println("Значение " + reverse + " записано в файл");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

