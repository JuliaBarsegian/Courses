public class HW_Task15 {
    public static void main(String[] arg) {
        int arr[] = new int[10];
        System.out.println("Массив случайных чисел:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nCортировка пузырьком:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}