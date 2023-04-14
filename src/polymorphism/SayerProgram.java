package polymorphism;

import domain.*;

import java.util.List;
import java.util.Random;

public class SayerProgram {

    public static void main(String[] args) {
        // sayer tipus estàtic Sayer
        Sayer sayer;
        // sayer tipus dinàmic Cat
        // Codi és correcte -> tipus estàtic
        // tipus dinàmic -> temps d'execució
        sayer = new Random().nextBoolean() ? new Dog() : new Cat();

        // decicir el mètode que s'execute -> tipus dinàmic
        System.out.println(sayer.say());
    }
}
