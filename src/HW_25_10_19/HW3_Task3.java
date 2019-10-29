package HW_25_10_19;

public class HW3_Task3 {
    public static void main(String[] args) {
        String s1 = new String("1.0.0");
        String s2 = new String("1.1.1");
        int result = (s1.compareTo(s2));
        if (result < 0)
            System.out.println("Версии библиотек не совпадают, Библиотека " + s1 + " является устаревшей");
        else if (result > 0) {
            System.out.println("Версии библиотек не совпадают, Библиотека " + s2 + " является устаревшей");
        } else if (result == 0) {
            System.out.println("Версии библиотек совпадают");
        }
    }
}