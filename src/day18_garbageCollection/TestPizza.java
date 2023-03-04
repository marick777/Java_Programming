package day18_garbageCollection;

public class TestPizza {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.size ='M';
        pizza1.numberOfPepperoniTopping = 1;
        pizza1.numberOfCheeseTopping = 2;

        Pizza pizza2 = new Pizza();
        pizza2.setInfo('L',2,3);


        System.out.println(pizza1.calcCost());
        System.out.println(pizza2);

        System.out.println("------------------------------------------------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('S', 2,2);
            Pizza medium = new Pizza();
            total +=small.calcCost();
            medium.setInfo('M',3,4);
            total += medium.calcCost();
            Pizza large = new Pizza();
            large.setInfo('L',4,5);
            total += large.calcCost();
        }

        System.out.println("total price = "+total);


    }
}
