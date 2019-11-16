package HW_08_11_19.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_Task3 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("msg1", "msg2", "msg3"));
        int[] number = {1, 2, 3};
        ArrayList<Integer> intList = new ArrayList<Integer>(number.length);
        {
            for (int i : number) {
                intList.add(i);
            }
        }
        System.out.println(strList);
        System.out.println(intList);
    }
}