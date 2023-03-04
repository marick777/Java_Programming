package day35_OOP_PolymorpismImtro.tramsportationTask;

import day34_OOP_Interface.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {


    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }



    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel()+" is lending");
    }

    @Override
    public void fly() {
        System.out.println("Plane "+" "+getMake()+" "+getModel()+" is flying");
    }
}
/*
Create an abstract sub class of Transpotation named Plane that implements Flyable

				non-abstract method:
					land()
 */