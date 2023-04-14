package polymorphism;

import domain.Cat;
import domain.Dog;
import domain.Sayer;

import java.util.Random;

public class SayerProgramVar {

    public static void main(String[] args) {
        // var sayer = new Dog();
        // Dog sayer = new Dog();

        var sayer = new Random().nextBoolean() ? new Dog() : new Cat();
        Sayer sayerAlt = new Random().nextBoolean() ? new Dog() : new Cat();

        var sayer2 = new Random().nextBoolean() ? new Dog() : "patata";
        // Sayer sayerAlt2 = new Random().nextBoolean() ? new Dog() : "patata";

        System.out.println(sayer.say());
        //System.out.println(sayer2.say());
    }
}
