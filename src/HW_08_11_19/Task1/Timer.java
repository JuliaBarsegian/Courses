package HW_08_11_19.Task1;

public class Timer {
    public static void main(String[] args) {
        System.out.println("Подождите 10 секунд");
        try {
            while (true) {
                Thread.sleep(10 * 1000);
                System.out.println("Прошло 10 секунд");
            }
        } catch (Exception e) {
            System.out.println("Получили исключение");
        }
    }
}