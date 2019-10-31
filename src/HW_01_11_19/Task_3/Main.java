package HW_01_11_19.Task_3;

public class Main {
    public static void main(String[] args) {
        double temperature = 27.3;
        System.out.println("Температура в Цельсиях = " + new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("Температура в Кельвинах = " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("Температура в Фаренгейтах = " + new FahrenheitConverter().getConvertedValue(temperature));
    }
}

