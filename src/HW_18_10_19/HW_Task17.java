package HW_18_10_19;

import java.util.Random;

public class HW_Task17 {
    public static void main(String[] arg) {
        int[][] mass = new int[5][];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = new int[1 + rand.nextInt(10)];
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = 1 + rand.nextInt(50);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}