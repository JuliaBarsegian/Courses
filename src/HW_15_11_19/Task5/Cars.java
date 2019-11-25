package HW_15_11_19.Task5;

public class Cars {
    private String brand;
    private String model;
    private int price;

    Cars(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = (int) price;
    }

    String getBrand() {
        return brand;
    }

    double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

