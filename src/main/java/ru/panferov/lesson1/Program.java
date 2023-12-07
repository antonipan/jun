package ru.panferov.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        // Первый способ
        //        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x + y);
//            }
//        };
//        System.out.println(plainInterface.action(5, 3));

//        // Второй способ
//        PlainInterface plainInterface = (x, y) -> String.valueOf(x+y);
//        System.out.println(plainInterface.action(5, 3));
//
//        PlainInterface plainInterface1 = (x, y) -> String.valueOf(Integer.compare(x, y));
//        System.out.println(plainInterface1.action(3, 4));
//
//        IntInterface intInterface = Integer::sum;
//        System.out.println(intInterface.action(10, 13));
//
//        IntInterface intInterface1 = Integer::compare;
//        System.out.println(intInterface1.action(10, 10));

//        List <String> list = Arrays.asList("Привет", "мир", "!", "Я", "работаю");
//
////        list = list.stream().filter(str -> str.length() >4).collect(Collectors.toList());
//        list.stream().filter(str -> str.length() > 3).forEach(System.out::println);
//
//        List <Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 7, 11, 4, -4, 1, 0, 2, 8, 5, 9);
////        numbers.stream().map(x -> x*2).forEach(System.out::print);
////
////        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
////        System.out.println();
//        numbers.stream().sorted(Comparator.naturalOrder()).distinct().forEach(x -> {
//            if (x % 2== 0) {
//                System.out.print(x + " ");
//            } else {
//                System.out.print("\n" + x);
//            }
//        });

//        List <User> users = new ArrayList<>(10);
//        users.add(new User("kirill", 25));
//        users.add(new User("Olga", 45));
//        users.add(new User("Nikolay", 44));
//        users.add(new User("Victoriya", 34));
//        users.add(new User("Nikanor", 18));
//        users.add(new User("Karteziy", 51));
//
//        users.stream()
//                .map(user -> new User(user.name, user.age - 5))
//                .filter(user -> (user.age > 30))
//                .forEach(x -> {
//            System.out.println(x.age);
//        });

    }
}
