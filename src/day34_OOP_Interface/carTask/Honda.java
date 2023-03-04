package day34_OOP_Interface.carTask;

public class Honda extends Car{


    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Turn key to start "+getMake()+" "+getModel());
    }
}
