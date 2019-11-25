package HW_15_11_19.Task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        int num;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cars> carsList = new ArrayList<>();
        carsList.add(new Cars("Audi", "A8", 25000));
        carsList.add(new Cars("Mazda", "6", 20500));
        carsList.add(new Cars("BMW", "X6", 25350));
        carsList.add(new Cars("Honda", "CR-V", 15000));
        carsList.add(new Cars("Nissan", "Almera", 19000));
        carsList.add(new Cars("Toyota", "Rav4", 23000));

        System.out.println("Выберете нужную опцию:\n 1 - добавить машину\n 2 - получить информацию по машине\n 3 - купить машину\n 4 - вывести список машин\n");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                Cars add = addCar();
                if (add.getPrice() > 0) {
                    carsList.add(add);
                    System.out.println("Новая машина добавлена в автосалон\n");
                } else {
                    System.out.println("Цена введена неверно");
                }
                break;
            case 2:
                num = infoAboutCar(carsList);
                if (num <= carsList.size()) {
                    System.out.println(carsList.get(num - 1));
                } else {
                    System.out.println("Номер введен неверно");
                }
                break;
            case 3:
                num = buyCar(carsList);
                if (num <= carsList.size()) {
                    carsList.remove(num - 1);
                    System.out.println("Клиент купил машину из автосалона");
                } else {
                    System.out.println("Номер введен неверно");
                }
                break;
            case 4:
                for (Cars c : carsList) {
                    System.out.println(c);
                }
                break;
            default:
                System.out.println("Такой опции не существует");
        }
    }

    private static Cars addCar() {
        Scanner scanner = new Scanner(System.in);
        int price;
        System.out.println("Введите марку машины");
        String brand = scanner.nextLine();
        System.out.println("Введите модель машины");
        String model = scanner.nextLine();
        System.out.println("Введите цену машины");
        if (scanner.hasNextDouble()) {
            price = scanner.nextInt();
        } else {
            price = -1;
        }
        Cars car = new Cars(brand, model, price);
        return car;
    }

    private static int infoAboutCar(ArrayList<Cars> cars) {
        int num = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("По какой машине Вы хотите получить информацию? Выберите номер");
        for (Cars c : cars) {
            System.out.println(num + " - " + c.getBrand());
            num++;
        }
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            num = cars.size() + 1;
        }
        return num;
    }

    private static int buyCar(ArrayList<Cars> cars) {
        int num = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую машину Вы хотите купить? Выберите номер");
        for (Cars c : cars) {
            System.out.println(num + " - " + c);
            num++;
        }
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            num = cars.size() + 1;
        }
        return num;
    }
}

