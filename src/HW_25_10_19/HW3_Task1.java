package HW_25_10_19;

public class HW3_Task1 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{12, 20, 105};
        int[] c = new int[a.length + b.length];
        {
            System.arraycopy(a, 0, c, 0, a.length);
            System.arraycopy(b, 0, c, a.length, b.length);
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + " ");
            }
        }
    }
}
