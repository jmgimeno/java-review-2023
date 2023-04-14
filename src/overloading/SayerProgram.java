package overloading;

import domain.*;

import java.util.List;

public class SayerProgram {
    private static void doSay(Sayer s) {
        System.out.println("Lalala");
    }
    private static void doSay(Dog d) {
        System.out.println(d.say());
    }

    private static void doSay(Cat c) {
        System.out.println(c.say());
    }

    public static void main(String[] args) {

        List<Sayer> ss = List.of(new Dog(), new Cat());
        for (Sayer s : ss) {
            System.out.println(s.say());
            // s té un tipus estàtic -> Sayer
            // no troba cap mètode vàlid
            doSay(s);
        }
        // tipus estàtics new Cat() -> Cat
        // en cas de varis -> més específic
        doSay(new Cat());
    }
}
