package HW_01_11_19.Task_3;

public class KelvinConverter implements Converter {
    @Override
    public double getConvertedValue(double value) {
        return value + 273.15;
    }
}
