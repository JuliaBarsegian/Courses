package HW_01_11_19.Task_1;

public class Main {
    public static void main(String[] args) {
        Cat Cat = new Cat("Плотоядное", "Кошачие", "Шотландский вислоухий", "Мяу-мяу");
        Cat.displayInfo();
        Cat.eat();
        Cat.eaten();
        Cat.move();

        Mouse Mouse = new Mouse("Плотоядное", "Мышиные", "Полевая", "Пи-пи-пи");
        Mouse.displayInfo();
        Mouse.eaten();
        Mouse.move();


        Dog Dog = new Dog("Плотоядное", "Псовые", "Бигль", "Гав");
        Dog.displayInfo();
        Dog.eat();
        Dog.move();
    }
}
