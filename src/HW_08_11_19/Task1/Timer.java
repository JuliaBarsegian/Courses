package HW_08_11_19.Task1;

public class Timer implements Interval {
    @Override
    public void showTime(int time) {
        System.out.println("Прошло " + time + " секунд");
    }
}
