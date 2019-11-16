package HW_01_11_19.Task_2;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(3.5);
        Cylinder cylinder = new Cylinder(3, 3);
        Pyramid pyramid = new Pyramid(150, 150);

        Box box = new Box(1500);

        System.out.println(box.add(ball)); // true
        System.out.println(box.add(cylinder)); // true
        System.out.println(box.add(pyramid)); // false
    }
}