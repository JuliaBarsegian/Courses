package HW_08_11_19.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionUtil {

    public void createArrayList() {
        ArrayList<String> myList1 = new ArrayList<>();
        myList1.add("str1");
        myList1.add("str2");
        myList1.add("str3");
        System.out.println(myList1);
    }

    public void createLinkedList() {
        LinkedList<String> myList2 = new LinkedList<>();
        myList2.add("str4");
        myList2.add("str5");
        myList2.add("str6");
        System.out.println(myList2);
    }

    public void createPriorityQueue() {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println(myQueue);
    }
}
