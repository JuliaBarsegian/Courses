package HW_08_11_19.Task4;

import HW_08_11_19.Task4.DifferentTypes;

public class HW_Task4_Main {
    public static void main(String[] args) {
        DifferentTypes<Integer> type1 = new DifferentTypes<>(new Integer[]{1, 2, 3, 4, 5, 6});
        DifferentTypes<String> type2 = new DifferentTypes<>(new String[]{"str1", "str2", "str3"});
        DifferentTypes<Double> type3 = new DifferentTypes<>(new Double[]{12.5, 15.5, 78.5});
        type1.index(type1.getDifTypes(), 2);
        type2.index(type2.getDifTypes(), 2);
        type3.index(type3.getDifTypes(), 2);
    }
}
