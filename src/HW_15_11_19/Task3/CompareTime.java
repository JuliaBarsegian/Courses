package HW_15_11_19.Task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareTime {
    public static void main(String... args) {
        int number = 10000;
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < number; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        long time = System.nanoTime();
        for (int i = 0; i < number / 2; i++) {
            linkedList.remove(number / 2);
        }
        System.out.println("LinkedList time: " + (System.nanoTime() - time));
        time = System.nanoTime();
        for (int i = 0; i < number / 2; i++) {
            arrayList.remove(number / 2);
        }
        System.out.println("ArrayList time: " + (System.nanoTime() - time));
    }
}

