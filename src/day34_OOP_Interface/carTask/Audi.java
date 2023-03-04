package day34_OOP_Interface.carTask;

public class Audi extends Car{


    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Pres Start button to start "+getMake()+" "+getModel());
    }

    public void autoPark(){
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }
}
/*
Audi
					extra methods:
						autoPark()
 */
