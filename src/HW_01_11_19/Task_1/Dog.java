package HW_01_11_19.Task_1;

class Dog extends Animals implements Moveable, Eat {

    public Dog(String type, String kind, String breed, String sound) {
        super(type, kind, breed, sound);
    }

    @Override
    public void eat() {
        System.out.println("Собака может кого-то съесть");
    }

    @Override
    public void move() {
        System.out.println("Собака может двигаться");
    }

    @Override
    public void displayInfo() {
        System.out.println("Животное принадлежит типу: " + super.getType() + "\nСемейство: " + super.getKind() + "\nПорода: " + super.getBreed() + "\nИздает звук: " + super.getSound() + "\n");
    }
}
