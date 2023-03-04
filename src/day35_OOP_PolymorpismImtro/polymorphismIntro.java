package day35_OOP_PolymorpismImtro;

import day31_OOP_MethodOverriding.shape_MethodOverriding.Circle;
import day33_OOP_Abstraction.employeeTask.*;
import day34_OOP_Interface.animalTask.*;
import day34_OOP_Interface.carTask.Audi;
import day34_OOP_Interface.carTask.Car;
import day34_OOP_Interface.carTask.Honda;
import day34_OOP_Interface.carTask.Tesla;

import java.lang.reflect.Type;
import java.util.Arrays;

public class polymorphismIntro {
    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Mila", "Seam", 'F', 3, "Small", "Gray");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;



        Animal[] animals ={dog, cat, tiger, lion, eagle} ;

        Animal animal = dog;
        animal.eat();
        animal.drink();
        animal.sleep();

        System.out.println("-------------------------------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Accord", "Silver", 2020, 35000);

        Audi audi = new Audi("RS7", "Black", 2023, 89000);

        Tesla tesla = new Tesla("Model S", "White", 2021, 120000);

        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 100000, "Java");

        Tester tester = new Tester("Vivian", 28, 'F', "D1", "SDET", 120000);

        Driver driver = new Driver("Aaron", 48, 'M', "E1", "Truck Driver", 90000);


        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, tester, driver};

        System.out.println(Arrays.toString(objects));

        Employee[] employee = {teacher, developer, tester, driver};

        System.out.println(Arrays.toString(employee));

        Employee obj = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);

        obj.work();


        System.out.println("-------------------------------------------------------------------------");


        Tesla car1 = new Tesla("Model Y", "White", 2020, 55000);

        car1.start();
        car1.autoPilot();
    }
}
