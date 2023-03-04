package day35_OOP_PolymorpismImtro;

import day34_OOP_Interface.animalTask.*;
import day35_OOP_PolymorpismImtro.tramsportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
       // animal.fly();

        animal.eat();
        animal.drink();
        animal.sleep();

        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");

        //obj1.eat();
        //obj1.sleep();
        //obj1.drink();
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot, eagle};

        Swimmable[] fish = {shark, dolphin, duck, dog};

        Playable[] friendlyAnimals = {dog, cat, parrot, dolphin, duck};

        boolean isAnimal = dog instanceof Animal;

        System.out.println(isAnimal);

        System.out.println("--------------------------------------------------------------------");

        Car car = new Tesla("Tesla", "Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectric = car instanceof Electric;
        boolean isAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = "+isTesla);
        System.out.println("isAudi = "+isAudi);
        System.out.println("isElectric = "+isElectric);
        System.out.println("isAutoPark = " + isAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);


        System.out.println("--------------------------------------------------------------------");



    }
}
