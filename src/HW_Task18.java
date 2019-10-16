public class HW_Task18 {
    public static void main(String[] arg) {
        int[][] mass = new int[5][];
        mass[0] = new int[1];
        mass[1] = new int[2];
        mass[2] = new int[3];
        mass[3] = new int[4];
        mass[4] = new int[5];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
