public class HW_Task9 {
    public static void main(String[] arg) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int j = 1;
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
            if (j % 4 == 0) {
                System.out.println();
            }
            j++;
        }
    }
}