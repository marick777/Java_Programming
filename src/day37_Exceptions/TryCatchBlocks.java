package day37_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Program1 started");


        try {
            System.out.println(9 / 0); // ArithmeticException
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program1 ended");


        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program2 ended");



        System.out.println("--------------------------------------------------------------------------------");


        System.out.println("Program3 started");
        try {
            Thread.sleep(7000);
            System.out.println("Try Block");
        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program3 ended");
    }
}
