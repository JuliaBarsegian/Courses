package HW_08_11_19.Task2;

public class LetterPosition {
    public static void main(String[] args) {
        getLetterPosition();
    }

    public static void getLetterPosition() {
        for (Alphabet a : Alphabet.values())
            System.out.println(a + " " + (a.ordinal() + 1));
    }
}