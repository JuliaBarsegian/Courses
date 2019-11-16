package HW_01_11_19.Task_1;

class Cat extends Animals implements Moveable, Eatable, Eat {

    public Cat(String type, String kind, String breed, String sound) {
        super(type, kind, breed, sound);
    }

    @Override
    public void eat() {
        System.out.println("Кот может кого-то съесть");
    }

    @Override
    public void eaten() {
        System.out.println("Кота может кто-то съесть");
    }

    @Override
    public void move() {
        System.out.println("Кот может двигаться\n");
    }

    @Override
    public void displayInfo() {
        System.out.println("Животное принадлежит типу: " + super.getType() + "\nСемейство: " + super.getKind() + "\nПорода: " + super.getBreed() + "\nИздает звук: " + super.getSound() + "\n");
    }
}
