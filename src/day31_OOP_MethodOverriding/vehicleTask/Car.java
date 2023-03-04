package day31_OOP_MethodOverriding.vehicleTask;

public class Car extends Vehicle{

    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(){
        System.out.println(getBrand()+" "+getModel()+" is driving");
    }
}
/*
Create a sub class of Vehicle named Car

			Extra methods:
				drive()
 */