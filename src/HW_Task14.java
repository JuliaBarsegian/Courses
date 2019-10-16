public class HW_Task14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int max = array[0];
        int min = array[0];
        double avg;
        int sum = 0;
        System.out.println("Массив случайных чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            sum += array[i];
        }
        avg = (double) sum / array.length;
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}