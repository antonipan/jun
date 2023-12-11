package ru.panferov.lesson2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,
                                            InvocationTargetException,
                                            InstantiationException,
                                            IllegalAccessException {
        Class <?> car = Class.forName("ru.panferov.lesson2.Car");
        Constructor<?> [] constructors = car.getConstructors();
        System.out.println(constructors);
        Object gaz = constructors[0].newInstance("ГАЗ");
        System.out.println(gaz);

//        // Работа с публичными полями
//        Field [] fields = gaz.getClass().getFields();
//        int tmp = fields[fields.length - 1].getInt(gaz);
//        fields[fields.length-1].setInt(gaz, tmp*2);

        Method  [] methods = gaz.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}
