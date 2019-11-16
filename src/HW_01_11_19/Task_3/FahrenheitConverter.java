package HW_01_11_19.Task_3;

public class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double value) {
        return 1.8 * value + 32;
    }
}
