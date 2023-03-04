package day31_OOP_MethodOverriding.vehicleTask;

public class Bike extends Vehicle{

    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride(){
        System.out.println(getBrand()+" "+getModel()+" is riding");
    }
}
/*
Create a sub class of Vehicle named Bike

			Extra methods:
				ride()
 */
