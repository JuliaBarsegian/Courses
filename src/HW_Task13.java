public class HW_Task13 {
    public static void main(String[] arg) {
        int[] mas = new int[20];
        System.out.println("Массив случайных чисел");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int[] ms1 = new int[10];
        int[] ms2 = new int[10];

        for (int i = 0; i < mas.length / 2; i++) {
            ms1[i] = mas[i];
            ms2[i] = mas[i + mas.length / 2];
        }
        System.out.println("Первый массив");
        for (int i = 0; i < mas.length / 2; i++) {
            System.out.print(ms1[i] + " ");
        }
        System.out.println("\nВторой массив");
        for (int i = 0; i < mas.length / 2; i++) {
            System.out.print(ms2[i] + " ");
        }
        System.out.println("\nСумма элементов 2х массивов");
        for (int i = 0; i < ms1.length; i++) {
            System.out.print(ms1[i] + ms2[i] + " ");
        }
    }
}
