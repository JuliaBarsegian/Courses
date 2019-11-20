package HW_08_11_19.Task1;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        Timer timer = new Timer();
        System.out.println("Подождите 10 секунд");
        while (true) {
            num++;
            try {
                Thread.sleep(10 * 1000);
            } catch (Exception e) {
                System.out.println("Получили исключение");
            }
            timer.showTime(num * 10);
        }
    }
}