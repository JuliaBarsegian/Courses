import java.util.Random;

public class HW_Task17 {
    public static void main(String[] arg) {
        int[][] mass = new int[5][];
        Random rand = new Random();
        mass[0] = new int[1 + rand.nextInt(10)];
        mass[1] = new int[1 + rand.nextInt(10)];
        mass[2] = new int[1 + rand.nextInt(10)];
        mass[3] = new int[1 + rand.nextInt(10)];
        mass[4] = new int[1 + rand.nextInt(10)];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = 1 + rand.nextInt(10);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}