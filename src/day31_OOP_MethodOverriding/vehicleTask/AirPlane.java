package day31_OOP_MethodOverriding.vehicleTask;

public class AirPlane extends Vehicle{
    public AirPlane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){
        System.out.println(getBrand()+" "+getBrand()+" is flying");
    }
}
/*
Create a sub class of Vehicle named AirPlane

			Extra methods:
				fly()
 */
