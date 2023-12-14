package ru.panferov.homework03;

import ru.panferov.homework02.task4.Dog;

import java.io.*;
import java.sql.Struct;

public class Student implements Serializable {
    private String name;
    private int age;
    private transient double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public Student (Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.gpa = student.getGpa();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public static void saveToFileBin (Student student) {
        try (FileOutputStream fos = new FileOutputStream("students.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(student);
            System.out.println("Объект успешно сериализован... ");
        } catch (IOException e) {
            System.out.println("Ошибка сериализации");;
        }
    }

    public static Student loadFromFileBin () {
        try (FileInputStream input = new FileInputStream("students.bin");
            ObjectInputStream ois = new ObjectInputStream(input)){
            System.out.println("Объект успешно десериализован...");
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println("Что-то пошло не так. ");
            return null;
        }
    }
}
