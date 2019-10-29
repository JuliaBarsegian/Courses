package HW_25_10_19;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Иван", "Иванов", "12.12.1992", 1));
        list.add(new Student("Петр", "Петров", "15.07.1990", 1));
        list.add(new Student("Максим", "Сидоров", "12.02.1991", 3));
        list.add(new Student("Сергей", "Ванеев", "26.12.1992", 2));
        list.add(new Student("Влад", "Щеглов", "01.12.1991", 1));

        Student.printStudent(list, 1);
    }

    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    static void printStudent(List<Student> list, int course) {
        for (Student entity : list) {
            if (entity.getCourse() == course) {
                System.out.println("Имя: " + entity.getName() + " Фамилия: " + entity.getSurname() + " Курс: " + entity.getCourse());
            }
        }
    }
}