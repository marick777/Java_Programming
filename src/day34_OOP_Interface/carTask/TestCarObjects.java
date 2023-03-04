package day34_OOP_Interface.carTask;

public class TestCarObjects {
    public static void main(String[] args) {


        // Car car1 = new Car();

        Honda honda = new Honda("Accord", "Silver", 2020, 35000);

        Audi audi = new Audi("RS7", "Black", 2023, 89000);

        Tesla tesla = new Tesla("Model S", "White", 2021, 120000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("---------------------------------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("---------------------------------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("---------------------------------------------------------------------");


        audi.autoPark();
        tesla.autoPilot();
    }
}
