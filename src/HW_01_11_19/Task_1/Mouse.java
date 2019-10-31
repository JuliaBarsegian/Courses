package HW_01_11_19.Task_1;

class Mouse extends Animals implements Moveable, Eatable {

    public Mouse(String type, String kind, String breed, String sound) {
        super(type, kind, breed, sound);
    }

    @Override
    public void eaten() {
        System.out.println("Мышь может кто-то съесть");
    }

    @Override
    public void move() {
        System.out.println("Мышь может двигаться\n");
    }

    @Override
    public void displayInfo() {
        System.out.println("Животное принадлежит типу: " + super.getType() + "\nСемейство: " + super.getKind() + "\nПорода: " + super.getBreed() + "\nИздает звук: " + super.getSound() + "\n");
    }
}
