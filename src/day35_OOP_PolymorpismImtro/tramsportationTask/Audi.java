package day35_OOP_PolymorpismImtro.tramsportationTask;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
/*
Create a sub class of car named Audi that implements AutoPark
 */
