package HW_15_11_19.Task2;

import java.util.ArrayList;

public class Clients {

    private int id;
    private static int counter;
    private ArrayList<Products> products;

    static {
        counter = 1;
    }

    Clients(ArrayList<Products> products) {
        this.products = products;
        id = counter++;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
