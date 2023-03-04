package day35_OOP_PolymorpismImtro.tramsportationTask;

public abstract class Car extends Transportation{


    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel());
    }




}
/*
Create an abstract sub class of Transportation named Car

				extra methods:
					drive()
 */
