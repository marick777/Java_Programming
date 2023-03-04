package day04_cancatenation;

public class PrimitivTypeCastings {


    public static void main(String[] args) {

        // ------------Implicit casting----------

        byte a = 15;

        short b = a;
        // short b = (short)a;

        System.out.println(b);

        int c = a;  //implicit casting

        long d = 3000L;

        float f = d; // implicit casting


        // ------------Explicit casting----------

        int x = 100;

        byte y = (byte)x;

        System.out.println(y);


        float z = 20.8F;

        short q = (short)z; //z = 20.8

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1;  // n1 = 2.5

        System.out.println(n2);

        System.out.println("------------------------------------------");


        int num = 500;

        byte result = (byte) num;  // explicit casting

        System.out.println(result);

        int r = 50000;

        short t = (short) r;

        System.out.println(t);





    }
}
