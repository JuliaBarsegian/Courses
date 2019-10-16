import java.util.Arrays;

public class HW_Task12 {

    public static void main(String[] args) {
        int n = 11;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(n / 2 - i);
        }
        System.out.println(Arrays.toString(array));
    }
}