package day36_OOP_PolimorphismContinue;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_OOP_Abstraction.employeeTask.*;
import day35_OOP_PolymorpismImtro.tramsportationTask.AutoPilot;
import day35_OOP_PolymorpismImtro.tramsportationTask.Electric;
import day35_OOP_PolymorpismImtro.tramsportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        // Dog dog = new Dog();

        //Cat cat = new Dog();

        Animal animal = new Dog();


        System.out.println("--------------------------------------------------------------");

        Animal animal1 = new Dog(); // upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog)animal1).bark(); //down casting 1 time use

        Dog dog1 = (Dog)animal1; // down casting reusable

        dog1.bark();

        // ((Cat)animal1.scratch(); //Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat

        System.out.println("--------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Silver", 350);

        phone.call(911);
        phone.text(123456);

        ((Nokia) phone).selfDefense();

       // ((IPhone)phone).faceTime(123456);// Nokia can not be converted to IPhone, because there is not "IS A" relationship

        ((Nokia) phone).selfDefense();


        System.out.println("--------------------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 100000, "Java");

        employee.work();

        System.out.println( ((Developer)employee).getProgrammingLanguage());

        //Tester tester = (Tester)employee;

        System.out.println("-------------------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();
        ((Tesla)electric).selfDrive();
        ( (AutoPilot)electric ).selfDrive();


        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();



    }
}
