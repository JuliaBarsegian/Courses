// Создать на диске каталог (папку). В созданном каталоге создать три файла с содержимым. Заархивировать эти три файла в одном архиве.
// Переименовать каталог. Вывести в консоль все содержимое каталога. Удалить каталог.

package HW_22_11_19;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Task5 {
    public static void main(String[] args) {
        // создать каталог
        File dir = new File("D://task5");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Папка task5 была создана на диске D");
        }

        // создать файлы в папке
        File newFile1 = new File("D://task5//MyFile1.txt");
        File newFile2 = new File("D://task5//MyFile2.txt");
        File newFile3 = new File("D://task5//MyFile3.txt");
        try (FileOutputStream fos1 = new FileOutputStream(newFile1); PrintStream printStream1 = new PrintStream(fos1);
             FileOutputStream fos2 = new FileOutputStream(newFile2); PrintStream printStream2 = new PrintStream(fos2);
             FileOutputStream fos3 = new FileOutputStream(newFile3); PrintStream printStream3 = new PrintStream(fos3)) {
            printStream1.println("Hello from File1");
            printStream2.println("Hello from File2");
            printStream3.println("Hello from File3");
        } catch (IOException ex) {
            System.out.println("File is not found");
        }
        if (newFile1.exists() && newFile2.exists() && newFile3.exists()) {
            System.out.println("Файлы были добавлены в папку");
        }

        // заархивировать файлы в 1 архив
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("D:\\task5\\MyFiles.zip"));
             FileInputStream fis = new FileInputStream(newFile1);) {
            ZipEntry entry1 = new ZipEntry("MyFile1.txt");
            ZipEntry entry2 = new ZipEntry("MyFile2.txt");
            ZipEntry entry3 = new ZipEntry("MyFile3.txt");
            zout.putNextEntry(entry1);
            zout.putNextEntry(entry2);
            zout.putNextEntry(entry3);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.closeEntry();
            System.out.println("Файлы были заархивированы\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // вывести в консоль все содержимое каталога
        System.out.println("Содержимое каталога: ");
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " \t folder");
                } else {
                    System.out.println(item.getName() + "\t file");
                }
            }
        }

        // переименовать каталог
        File newDir = new File("D://task5_Renamed");
        dir.renameTo(newDir);
        System.out.println("\nКаталог был переименован и теперь называется " + newDir);

        // удалить каталог
        File dir_delete = new File("D://task5_deleteMe");
        boolean created2 = dir_delete.mkdir();
        boolean deleted = dir_delete.delete();
        if (deleted) {
            System.out.println("Папка " + dir_delete + " была удалена c диска D");
        } else {
            System.out.println("Что-то пошло не так");
        }
    }
}
