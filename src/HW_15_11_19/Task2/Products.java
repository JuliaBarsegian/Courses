package HW_15_11_19.Task2;

public class Products {
    private String name;
    private double price;

    Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

