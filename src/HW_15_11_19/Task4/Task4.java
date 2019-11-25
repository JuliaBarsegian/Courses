package HW_15_11_19.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Ivanov");
        myMap.put(2, "Petrov");
        myMap.put(3, "Sidorov");

        Set<Integer> keys = myMap.keySet();
        System.out.println("Keys: " + keys);

        ArrayList<String> values = new ArrayList<>(myMap.values());
        System.out.println("Values: " + values);
    }
}
