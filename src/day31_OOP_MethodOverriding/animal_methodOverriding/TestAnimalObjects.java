package day31_OOP_MethodOverriding.animal_methodOverriding;

import day31_OOP_MethodOverriding.vehicleTask.Car;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bengale", 'F', 4, "Small", "Gray");

        Dog dog = new Dog("Max", "Hysky", 'M', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African Lion", 'M', 6, "Large", "Yellow", true);

        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black & White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-----------------------------------------------------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("-----------------------------------------------------------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();






    }
}
