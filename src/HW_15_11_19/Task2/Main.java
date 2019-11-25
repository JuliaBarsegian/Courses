package HW_15_11_19.Task2;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Products> productsCustomer1 = new ArrayList<>();
        productsCustomer1.add(new Products("Apple", 3.0));
        productsCustomer1.add(new Products("Banana", 2.2));
        Clients customer1 = new Clients(productsCustomer1);

        ArrayList<Products> productsCustomer2 = new ArrayList<>();
        productsCustomer2.add(new Products("Chocolate", 4.7));
        productsCustomer2.add(new Products("Sweets", 2.3));
        Clients customer2 = new Clients(productsCustomer2);

        ArrayList<Products> productsCustomer3 = new ArrayList<>();
        productsCustomer3.add(new Products("Pasta", 5.8));
        productsCustomer3.add(new Products("Pork", 10.2));
        Clients customer3 = new Clients(productsCustomer3);

        ArrayList<Products> productsCustomer4 = new ArrayList<>();
        productsCustomer4.add(new Products("Pizza", 22.4));
        productsCustomer4.add(new Products("Beer", 3.2));
        Clients customer4 = new Clients(productsCustomer4);

        ArrayDeque<Clients> queue = new ArrayDeque<>();
        queue.add(customer1);
        queue.add(customer2);
        queue.add(customer3);
        queue.add(customer4);

        while (queue.peek() != null) {
            System.out.println(queue.pop());
        }
    }
}

