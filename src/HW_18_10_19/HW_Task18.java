package HW_18_10_19;

public class HW_Task18 {
    public static void main(String[] arg) {
        int[][] mass = new int[5][];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = new int[1 + i];
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
