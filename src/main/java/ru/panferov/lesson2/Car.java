package ru.panferov.lesson2;

public class Car {
    private String name;
    private String price;
    private String engType;
    private String engPower;
    private int maxSpeed;

    public Car(String name) {
        this.name = name;
        this.price = "1000";
        this.engPower = "500 ls";
        this.engType = "VS";
        this.maxSpeed = 220;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}


