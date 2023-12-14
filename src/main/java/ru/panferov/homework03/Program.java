package ru.panferov.homework03;

public class Program {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 21, 4.1);
        Student student1 = new Student("Maria", 19, 4.7);
        Student.saveToFileBin(student);
        student1 = Student.loadFromFileBin();
        System.out.println("Имя студента: " + student1.getName());
        System.out.println("Возраст студента: " + student1.getAge());
        System.out.println("Средний балл будет Null, так как он не сериализуется: " + student1.getGpa());
    }
}
