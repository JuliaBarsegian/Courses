package HW_18_10_19;

public class HW_Task11 {
    public static void main(String[] args) {
        System.out.println("Массив чисeл от 1 до 100:");
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) (Math.random() * ((100 - 1) + 1)));
            System.out.println(array[i]);
        }
    }
}